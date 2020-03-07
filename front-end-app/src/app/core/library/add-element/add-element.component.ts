import { Component, OnInit, AfterViewInit } from '@angular/core';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';
import { LibraryService } from 'src/app/services/library.service';

@Component({
  selector: 'app-add-element',
  templateUrl: './add-element.component.html',
  styleUrls: ['./add-element.component.css']
})
export class AddElementComponent implements OnInit, AfterViewInit {
  postError = false;
  postSuccess = false;
  postErrorMessage = '';
  postSuccessMessage = '';

  sdElement = new StudyDesignElement("", "", "", false, "", false, false);

  constructor(private lbService: LibraryService) { }

  ngOnInit() {  
    
  }

  ngAfterViewInit(): void { 
    
   }

  onAddElement() {

    console.log('custome data: ', this.sdElement);
    this.lbService.addStudyDesignElement(this.sdElement).subscribe(
      result => this.onHttpSuccess(result),
      error => this.onHttpError(error)
    );
  }

  onHttpSuccess(successResponse){
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
