import { Component, OnInit, AfterViewInit } from '@angular/core';
import { StudyLevelContentService } from 'src/app/services/study-level-content.service';
import { StudyLevelContent } from 'src/app/services/model/study-level-content-model';
import { Objective } from 'src/app/services/model/objective.model';
import { ProtocolLevelContentService } from 'src/app/services/protocol-level-content.service';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElementValue } from 'src/app/services/model/sde-value-model';
import { NgForm } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-add-objective',
  templateUrl: './add-objective.component.html',
  styleUrls: ['./add-objective.component.css']
})
export class AddObjectiveComponent implements OnInit, AfterViewInit {
  studyLevelContentArray: StudyLevelContent[];
  libraryValueArray: StudyDesignElementValue[];
  //Library values
  objectiveList = [];
  endpointList = [];
  primaryTimePointList = [];

  objectiveModel = new Objective('', '', '','','');
  objectiveArray: Objective[];

  // Properties regarding error handling
  postError = false;
  postSuccess = false;
  postErrorMessage = '';
  postSuccessMessage = '';

  constructor(private studyService: StudyLevelContentService, private protocolService: ProtocolLevelContentService,
     private libraryService:LibraryService, private _router: ActivatedRoute) { }

  ngOnInit() {
    this.getStudyLevelContent();
  }
  ngAfterViewInit(): void {
    this.getLibraryValueData();
    this.editGivenProtocolId();
  }

  /* For search Box */
  getStudyLevelContent() {
    this.studyService.getStudyLevelContent().subscribe(
      response => {
        console.log('response: ', response),
          this.studyLevelContentArray = response
      },
      error => console.log('Error while getting study level content: ', error)
    );
  }

  // Get Library data
  getLibraryValueData(){
    this.libraryService.getStudyDesignElementValue().subscribe(
      result =>{
        this.libraryValueArray = result;
        this.libraryValueArray.forEach(element =>{
          if(element.studyDesignElement.includes('ObjectiveFullText')){
            this.objectiveList.push(element.value);
          }
          else if(element.studyDesignElement.includes('EndPointFullText')){
            this.endpointList.push(element.value);
          }
          else if(element.studyDesignElement.includes('PrimaryTimepoint')){
            this.primaryTimePointList.push(element.value);
          }
        });
      },
      error => console.log('error while calling library value api: ', error)
    );
  }

  // submit data
  onAddobjective(form: NgForm){
    console.log('submit data: ', this.objectiveModel);
    this.protocolService.addObjective(this.objectiveModel).subscribe(
      result => this.onHttpSuccess(result),
      error => this.onHttpError(error)
    );
  }

  getObjectiveData() {
    this.protocolService.getObjective().subscribe(
      response => {
        console.log("objective response: ", response),
          this.objectiveArray = response
      },
      error => console.log('Error while getting objective data', error)
    );
  }

  // Edit by objective id
  editGivenProtocolId() {
    var urlParam = this._router.snapshot.paramMap.get("id");
    console.log('edit route param: ', urlParam);
    if (urlParam != null && urlParam != "") {
      console.log('looking for objective id: ', urlParam)
      this.protocolService.findObjectiveById(urlParam).subscribe(
        result => this.objectiveModel = result,
        error => console.log(error)
      );
    }
  }

   /* Error Handling */
   onHttpSuccess(successResponse) {
    console.log('Success: ', successResponse);
    this.postSuccess = true;
    this.postSuccessMessage = "Record inserted successfully";
    //this.studyLevelContent = new StudyLevelContent('', '', '', '', '');
  }
  onHttpError(errorResponse: any) {
    console.log('error: ', errorResponse);
    this.postError = true;
    this.postErrorMessage = errorResponse.error.message;
  }


}
