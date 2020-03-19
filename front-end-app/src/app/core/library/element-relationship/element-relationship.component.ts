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
  rootSdeElement = "";
  sdeLibrary$:StudyDesignElement[];
  
  elementRelationship = new ElementRelationship('',null,false,'',null,false);
  elementRelationshipArray = [];

  constructor(private relationService: LibraryService) { }

  ngOnInit() {
    this.getStudyDesignElementLibrary();
  }

  getStudyDesignElementLibrary(){
    this.relationService.getStudyDesignElement().subscribe(
      response => {
        this.sdeLibrary$ = response;
        /*console.log('sde lib: ', this.sdeLibrary$);
        console.log('Length: ', this.sdeLibrary$.length);*/
        this.sdeLibrary$.forEach(element => {
          /*console.log('getStudyDesignElement: ', element),    */      
          this.elementRelationshipArray.push(new ElementRelationship(element.studyDesignElement,element.elementId,false,element.studyDesignElement,element.elementId,false))        
        });
        console.log('after elementRelationshipArray push: ', this.elementRelationshipArray);
      },
      error => console.log('error while calling sde library: ', error)
    );
  }

  addElementRelationship(from: NgForm){
    console.log('Post call data: ',this.elementRelationshipArray);
    this.elementRelationshipArray.forEach(postModelData => {
      /*this.relationService.addStudyDesignElementRelationship(postModelData).subscribe(
        response => console.log('record inserted: ', response),
        error => console.log('Error while adding relationship: ', error)
      );*/
    });
    
  }

}
