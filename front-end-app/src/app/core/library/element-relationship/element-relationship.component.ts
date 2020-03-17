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
  sdeLibrary$: StudyDesignElement[];
  
  elementRelationshipArray = [];
  elementRelationship = new ElementRelationship('',null,false,'',null,false);

  constructor(private relationService: LibraryService) { }

  ngOnInit() {
    this.elementRelationshipArray.push(this.elementRelationship);
    this.getStudyDesignElementLibrary();
  }

  getStudyDesignElementLibrary(){
    this.relationService.getStudyDesignElement().subscribe(
      response => this.sdeLibrary$ = response,
      error => console.log('error while calling sde library: ', error)
    );
  }

  addElementRelationship(form: NgForm){
    this.relationService.addStudyDesignElementRelationship(this.elementRelationship).subscribe(
      response => console.log('record inserted: ', response),
      error => console.log('Error while adding relationship: ', error)
    );
    
  }

}
