import { Component, OnInit } from '@angular/core';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';
import { StudyDesignElementValue } from 'src/app/services/model/sde-value-model';

@Component({
  selector: 'app-element-value-relationship',
  templateUrl: './element-value-relationship.component.html',
  styleUrls: ['./element-value-relationship.component.css']
})
export class ElementValueRelationshipComponent implements OnInit {

  sdeLibrary$: StudyDesignElement[];
  sdeLibraryValue$: StudyDesignElementValue[];

  element1: string = '';

  constructor(private service: LibraryService) { }

  ngOnInit() {
    this.getStudyDesignElementLibrary();
   // this.getElementValue();
  }

  getStudyDesignElementLibrary(){
    this.service.getStudyDesignElement().subscribe(
      response => {
        this.sdeLibrary$ = response;
        console.log('sde lib: ', this.sdeLibrary$);
        console.log('Length: ', this.sdeLibrary$.length);
        // this.sdeLibrary$.forEach(element => {
        //   /*console.log('getStudyDesignElement: ', element),    */      
        //   this.elementRelationshipArray.push(new ElementRelationship('', null,false,element.studyDesignElement,element.elementId,false))        
        // });
        // console.log('after elementRelationshipArray push: ', this.elementRelationshipArray);
      },
      error => console.log('error while calling sde library: ', error)
    );
  }

  onElement1Change(event: any){
    console.log('event', event.target.value);
    this.service.getStudyDesignElementValueByName(this.element1).subscribe(
      response => {
        console.log('byName response: ', response);
        this.sdeLibraryValue$ = response;
      },
      error => console.log('error: ', error)
    );
  }


  /*getElementValue(){
    this.service.getStudyDesignElementValue().subscribe(
      response =>{
        console.log('getElementValue response: ', response);
         console.log('getElementValue response: ', response),
         this.sdeLibraryValue$ = response;
      },
      error => console.log('error while calling getElementValue ', error)
    );
  }*/

}
