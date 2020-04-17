import { Component, OnInit, AfterViewInit } from '@angular/core';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElementValue } from 'src/app/services/model/sde-value-model';
import { ElementValueRelationship } from 'src/app/services/model/sde-value-relation-model';
import { StudyLevelContent } from 'src/app/services/model/study-level-content-model';
import { NgForm } from '@angular/forms';
import { StudyLevelContentService } from 'src/app/services/study-level-content.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-add-study-content',
  templateUrl: './add-study-content.component.html',
  styleUrls: ['./add-study-content.component.css']
})
export class AddStudyContentComponent implements OnInit, AfterViewInit {
  elementValuesAll: StudyDesignElementValue[] = [];
  elementValue$: StudyDesignElementValue[];
  elementValueRelationship: ElementValueRelationship;
  elementValueRelationshipArray: ElementValueRelationship[] = [];

  studyLevelContent = new StudyLevelContent('', '', '', '', '');

  // for Id search dropdown
  studyLevelContentArray: StudyLevelContent[];
  protocolIdArray = [];

  theropoticArea = [];
  indicationArray: string[] = [];
  studyPhase = [];
  studyType = [];

  urlParam = '';

  /* Properties regarding error handling */

  postError = false;
  postSuccess = false;
  postErrorMessage = '';
  postSuccessMessage = '';

  constructor(private service: LibraryService, private studyService: StudyLevelContentService, private _router: ActivatedRoute) { }

  ngOnInit() {

    this.getStudyLevelContent();
  }

  ngAfterViewInit(): void {
    this.getElementValues();
    console.log('studyPhase: ', this.studyPhase);
    this.editGivenProtocolId();
  }

  /* For search Box */
  getStudyLevelContent() {
    this.studyService.getStudyLevelContent().subscribe(
      response => this.studyLevelContentArray = response,
      error => console.log('Error while getting study level content: ', error)
    );
  }

  /* For search Box changes, data will automatically pull for selected protocolId */
  getStudyProtocolsDetails() {
    var protocolId = this.studyLevelContent.protocolId;
    console.log('Selected protocol Id: ', protocolId);
    this.studyService.findStudyLevelContentById(protocolId).subscribe(
      response => this.studyLevelContent = response,
      error => {
        console.log("Error while fetching data", error),
        this.studyLevelContent = new StudyLevelContent(protocolId, '', '', '', '');
      }
     
    );

  }

  onAddStudyLevelContent(form: NgForm) {
    console.log('class binding: ', this.studyLevelContent);
    this.studyService.addStudyLevelContent(this.studyLevelContent).subscribe(
      response => {
        console.log('Data successfully inserted ', response);
        this.onHttpSuccess(response);
      },
      error => {
        console.log('Error while adding study level content ', error);
        this.onHttpError(error);
      },
    );
  }

  // Edit
  editGivenProtocolId() {
    this.urlParam = this._router.snapshot.paramMap.get("id");
    console.log('edit route param: ', this.urlParam);
    if (this.urlParam != null && this.urlParam != "") {
      console.log('looking for protocol id: ', this.urlParam)
      this.studyService.findStudyLevelContentById(this.urlParam).subscribe(
        result => this.studyLevelContent = result,
        error => console.log(error)
      );
    }
  }

  getElementValues() {
    this.service.getStudyDesignElementValue().subscribe(
      response => {
        console.log('getElementValues response: ', response);
        this.elementValuesAll = response;
        this.elementValuesAll.forEach(element => {
          if (element.studyDesignElement.includes('StudyPhase')) {
            this.studyPhase.push(element.value);
          }
          else if (element.studyDesignElement.includes('StudyType')) {
            this.studyType.push(element.value);
          }
          else if (element.studyDesignElement.includes('TheropaticArea')) {
            this.theropoticArea.push(element.value);
          }
        });
      },
      error => console.log('error while getting element values: ', error)
    );
  }

  getElementValueRelationship(event: any) {
    var theropoticAreaValue: string = this.studyLevelContent.therapeuticArea;

    this.service.getStudyElementValueRelationship().subscribe(
      response => {
        console.log('getElementValueRelationship response: ', response);
        this.elementValueRelationshipArray = response;
        this.elementValueRelationshipArray.forEach(element => {
          // remove from array if elementValue and type does not match
          this.indicationArray = [];
          if (element.elementValue.includes(theropoticAreaValue) && element.elementType3.includes('Indication')) {
            this.indicationArray.push(element.elementValue3);
          }
          else {
            this.elementValueRelationshipArray.pop();
          }
        });
      },
      error => console.log('error while calling getElementValueRelationship: ', error)
    );
  }


  /* Error Handling */
  onHttpSuccess(successResponse) {
    console.log('Success: ', successResponse);
    this.postSuccess = true;
    this.postSuccessMessage = "Record inserted successfully";
    this.studyLevelContent = new StudyLevelContent('', '', '', '', '');
  }
  onHttpError(errorResponse: any) {
    console.log('error: ', errorResponse);
    this.postError = true;
    this.postErrorMessage = errorResponse.error.message;
  }


}
