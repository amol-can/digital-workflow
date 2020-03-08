import { Component, OnInit, AfterViewInit } from '@angular/core';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';
import { LibraryService } from 'src/app/services/library.service';
import { ActivatedRoute } from '@angular/router';

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
  sdeLibrary: StudyDesignElement;

  urlParam = null;

  sdElement = new StudyDesignElement("", "", "", false, "", false, false);

  constructor(private lbService: LibraryService, private _router: ActivatedRoute) { }

  ngOnInit() {  
    /* TODO for later use 
    this._router.paramMap.subscribe(parameterMap =>{
      const elementid = +parameterMap.get("id");
      console.log('Route param: ', parameterMap.getAll);
    }); */
    this.urlParam = this._router.snapshot.paramMap.get("id");
    console.log("edit route param: "+this._router.snapshot.paramMap.get("id") );
    if(this.urlParam != null && this.urlParam !=""){
      this.searchElement(this.urlParam);
    }
  }

  searchElement(urlParam: any){
    console.log("inside the search element")
    this.lbService.findStudyDesignElement(this.urlParam).subscribe(
      result => this.sdElement = result,
      error => console.log("Error:", error)
    );
  }
  ngAfterViewInit(): void { 
    
   }

   /* To add/Post the form data */
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
