import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { StudyDesignElementValue } from 'src/app/services/model/sde-value-model';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';
import { NgForm } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-add-value',
  templateUrl: './add-value.component.html',
  styleUrls: ['./add-value.component.css']
})
export class AddValueComponent implements OnInit, AfterViewInit {
 
  postSuccess = false;
  postError = false;

  sdeValueModel: StudyDesignElementValue;
  sdeValues$: StudyDesignElementValue[];
  sdeLibrary$ : StudyDesignElement[];
  postErrorMessage = '';
  postSuccessMessage = '';
  urlParam = "16";

  sdeValue = new StudyDesignElementValue('', '', 0, '', null);

  constructor(private valueService: LibraryService, private _router: ActivatedRoute) { }

  ngOnInit() {
   
  }

  ngAfterViewInit(): void {
    this.getStudyDesignElementLibrary();
    this.editGivenElement();
    
  }  

  editGivenElement(){
    this.urlParam = this._router.snapshot.paramMap.get("id");
    console.log("edit route param: "+this._router.snapshot.paramMap.get("id") );
    if(this.urlParam != null && this.urlParam !=""){
      console.log('looking for sde value id: ', this.urlParam)
      this.valueService.findStudyDesignElementValue(this.urlParam).subscribe(
        result => this.sdeValue = result,
        error => console.log(error)
      );
    }
  }

  getStudyDesignElementLibrary(){
    this.valueService.getStudyDesignElement().subscribe(
      response => this.sdeLibrary$ = response,
      error => console.log('error while calling sde library: ', error)
    );
  }

  // TODO ngForm to furture use
  onAddSdeValue(valueForm: NgForm){    
    console.log('ngModel response',this.sdeValue);
    this.valueService.addStudyDesignElementValue(this.sdeValue).subscribe(
      result => this.onHttpSuccess(result),
      error => this.onHttpError('Error while submiting data #onAddSdeValue'+ error)
    );
  
  }

  onHttpSuccess(successResponse){
    this.sdeValue = new StudyDesignElementValue('','',null,'',null);
    console.log('Success: ',successResponse);
    this.postSuccess = true;
    this.postSuccessMessage = "Record inserted successfully";
  }
  onHttpError(errorResponse: any){
    console.log('error: ', errorResponse);
    this.postError = true;
    this.postErrorMessage = errorResponse.error.message;
  }


}
