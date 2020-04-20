import { Component, OnInit } from '@angular/core';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';
import { ElementRelationship } from 'src/app/services/model/element-relation-model';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-element-relationship',
  templateUrl: './element-relationship.component.html',
  styleUrls: ['./element-relationship.component.css']
})
export class ElementRelationshipComponent implements OnInit {
  rootSdeElement: string = "";
  rootSdeElementId: number = null;
  sdeLibrary$:StudyDesignElement[];
  
  elementRelationship = new ElementRelationship('',null,false,'',null,false);
  elementRelationshipArray: ElementRelationship[] = [];

  constructor(private relationService: LibraryService) { }

  ngOnInit() {
    this.getStudyDesignElementLibrary();
  }

  searchElement(elementName: string){
    this.relationService.getStudyDesignElementRelationship(elementName).subscribe(
      response => {
        console.log('search response: ', response);
        this.elementRelationshipArray = []
        this.elementRelationshipArray = response;
        console.log('response in array: ', this.elementRelationshipArray);
      },
      error => console.log('error: ', error)
    );
  }


  getStudyDesignElementLibrary(){
    this.relationService.getStudyDesignElement().subscribe(
      response => {
        this.sdeLibrary$ = response;
        /*console.log('sde lib: ', this.sdeLibrary$);
        console.log('Length: ', this.sdeLibrary$.length);*/
        this.sdeLibrary$.forEach(element => {
          /*console.log('getStudyDesignElement: ', element),    */      
          this.elementRelationshipArray.push(new ElementRelationship('', null,false,element.studyDesignElement,element.elementId,false))        
        });
        console.log('after elementRelationshipArray push: ', this.elementRelationshipArray);
      },
      error => console.log('error while calling sde library: ', error)
    );
  }

  addElementRelationship(form: NgForm){
    console.log('Post call data in Array: ',this.elementRelationshipArray);
    this.elementRelationshipArray.forEach(postModelData => {
      postModelData.elementType = this.rootSdeElement;
      console.log("model data: ", postModelData);
      this.relationService.addStudyDesignElementRelationship(postModelData).subscribe(
        response => console.log('record inserted: ', response),
        error => console.log('Error while adding relationship: ', error)
      );
    });
    
  }

  clearPage(){
    this.getStudyDesignElementLibrary();
  }

}
