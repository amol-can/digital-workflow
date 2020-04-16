import { Component, OnInit, AfterViewInit } from '@angular/core';
import { StudyLevelContentService } from 'src/app/services/study-level-content.service';
import { StudyLevelContent } from 'src/app/services/model/study-level-content-model';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElementValue } from 'src/app/services/model/sde-value-model';
import { ProtocolLevelContentModel } from 'src/app/services/model/protocol-level-content.model';
import { NgForm } from '@angular/forms';
import { ProtocolLevelContentService } from 'src/app/services/protocol-level-content.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-add-protocol-content',
  templateUrl: './add-protocol-content.component.html',
  styleUrls: ['./add-protocol-content.component.css']
})
export class AddProtocolContentComponent implements OnInit, AfterViewInit {
  studyLevelContentArray: StudyLevelContent[];
  //protocolId: string = null;
  protocolLevelContent = new ProtocolLevelContentModel('', '', '', '', '', '', '', '', '', '', '', '', null);



  /* Library values related */
  elementValuesAll: StudyDesignElementValue[] = [];
  armTypeArray = [];
  interventionModelArray = [];
  interventionTypeArray = [];
  maskingArray = [];

  /* Properties regarding error handling */
  postError = false;
  postSuccess = false;
  postErrorMessage = '';
  postSuccessMessage = '';

  constructor(private studyService: StudyLevelContentService, private elementValueService: LibraryService, 
    private protocolService: ProtocolLevelContentService, private _router: ActivatedRoute) { }

  ngOnInit() {
    this.getStudyLevelContent();
    
  }

  ngAfterViewInit():void{
    this.getElementValues();
    this.editGivenProtocolId();
  }

  getStudyProtocols() {
    var protocolId = this.protocolLevelContent.protocolId;
    console.log('Selected protocol Id: ', protocolId);
    this.protocolService.findProtocolLevelContentById(protocolId).subscribe(
      response => this.protocolLevelContent = response,
      error => {
        console.log("Error while fetching data", error),
        this.protocolLevelContent = new ProtocolLevelContentModel(protocolId, '', '', '', '', '', '', '', '', '', '', '', null);
      }
    );

  }

  /* Save protocol level data*/
  onAddProtocolLevelContent(form: NgForm) {
    console.log('Submit data', this.protocolLevelContent);
    this.protocolService.addProtocolLevelContent(this.protocolLevelContent).subscribe(
      response => this.onHttpSuccess(response),
      error => this.onHttpError(error)
    );
  }

  /* To get study level protocols in dropdown search */
  getStudyLevelContent() {
    this.studyService.getStudyLevelContent().subscribe(
      response => {
        this.studyLevelContentArray = response;
      },
      error => console.log('Error while getting study level content: ', error)
    );
  }

  // To get library related data for dropdowns
  getElementValues() {
    this.elementValueService.getStudyDesignElementValue().subscribe(
      response => {
        console.log('getElementValues response: ', response);
        this.elementValuesAll = response;
        this.elementValuesAll.forEach(element => {
          if (element.studyDesignElement.includes('ArmType')) {
            this.armTypeArray.push(element.value);
          }
          else if (element.studyDesignElement.includes('InterventionModel')) {
            this.interventionModelArray.push(element.value);
          }
          else if (element.studyDesignElement.includes('InterventionType')) {
            this.interventionTypeArray.push(element.value);
          }
          else if (element.studyDesignElement.includes('Masking')) {
            this.maskingArray.push(element.value);
          }
        });
      },
      error => console.log('error while getting element values: ', error)
    );
  }

  // Edit after route
  editGivenProtocolId(){
    var urlParam = this._router.snapshot.paramMap.get("id");
    console.log('edit route param: ', urlParam );
    if(urlParam != null && urlParam !=""){
      console.log('looking for protocol id: ', urlParam)
      this.protocolService.findProtocolLevelContentById(urlParam).subscribe(
        result => this.protocolLevelContent = result,
        error => console.log(error)
      );
    }
  }

  // Error handling
  
  onHttpSuccess(successResponse){
    console.log('Success: ',successResponse);
    this.postSuccess = true;
    this.postSuccessMessage = "Record saved successfully";
    //this.studyLevelContent = new StudyLevelContent('','','','','');
  }
  onHttpError(errorResponse: any){
    console.log('error: ', errorResponse);
    this.postError = true;
    this.postErrorMessage = errorResponse.error.message;
  }

}
