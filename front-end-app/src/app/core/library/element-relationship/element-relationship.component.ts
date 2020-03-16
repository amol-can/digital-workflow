import { Component, OnInit } from '@angular/core';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';
import { ElementRelationship } from 'src/app/services/model/element-relation-model';

@Component({
  selector: 'app-element-relationship',
  templateUrl: './element-relationship.component.html',
  styleUrls: ['./element-relationship.component.css']
})
export class ElementRelationshipComponent implements OnInit {
  sdeLibrary$: StudyDesignElement[];

  elementRelationship = new ElementRelationship('',null,false,'',null,false);

  constructor(private relationService: LibraryService) { }

  ngOnInit() {
    this.getStudyDesignElementLibrary();
  }

  getStudyDesignElementLibrary(){
    this.relationService.getStudyDesignElement().subscribe(
      response => this.sdeLibrary$ = response,
      error => console.log('error while calling sde library: ', error)
    );
  }

}
