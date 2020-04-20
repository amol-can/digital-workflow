import { Component, OnInit } from '@angular/core';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';
import { StudyDesignElementValue } from 'src/app/services/model/sde-value-model';
import { ElementRelationship } from 'src/app/services/model/element-relation-model';
import { ElementValueRelationship } from 'src/app/services/model/sde-value-relation-model';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-element-value-relationship',
  templateUrl: './element-value-relationship.component.html',
  styleUrls: ['./element-value-relationship.component.css']
})
export class ElementValueRelationshipComponent implements OnInit {

  sdeLibrary$: StudyDesignElement[];
  sdeLibraryValue$: StudyDesignElementValue[];
  sdeLibraryValue2$: StudyDesignElementValue[];
  sdeLibraryRelationship$: ElementRelationship[];

  elementValueRelationship = new ElementValueRelationship('', '', '', '', false, '', '');
  elementValueRelationshipArray: ElementValueRelationship[] = [];

  element1: string = '';
  element2: string = '';

  constructor(private service: LibraryService) { }

  ngOnInit() {
    this.getStudyDesignElementLibrary();
    // this.getElementValue();
    //this.onElement2Change(Event);
  }

  addValueRelationship(form: NgForm) {
    console.log('form value: ', form);
    this.elementValueRelationshipArray.forEach(elements => {
      elements.elementType = this.element1;
      elements.elementValue = this.elementValueRelationship.elementValue;
      if (elements.relatesTo == true) {
        console.log('true so calling call');
        this.service.addStudyElementValueRelationship(elements).subscribe(
          response => console.log('record inserted: ', response),
          error => console.log('Error while adding relationship: ', error)
        );
      }
    });
    console.log('final array: ', this.elementValueRelationshipArray);
  }

  getStudyDesignElementLibrary() {
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

  onElement1Change(event: any) {
    console.log('event', event.target.value);
    this.service.getStudyDesignElementValueByName(this.element1).subscribe(
      response => {
        console.log('byName response: ', response);
        this.sdeLibraryValue$ = response;
      },
      error => console.log('error: ', error)
    );
  }

  onElement2Change(event: any) {
    console.log('**element 2 event', event);
    this.service.getStudyDesignElementValueByName(this.element2).subscribe(
      response => {
        console.log('onElement2Change response: ', response);
        this.sdeLibraryValue2$ = response;
        this.elementValueRelationshipArray = [];
        this.sdeLibraryValue2$.forEach(element => {
          console.log('getStudyDesignElementValueArray: ', element),
            this.elementValueRelationshipArray.push(new ElementValueRelationship('', '', '', '', false, element.studyDesignElement, element.value))
        });
        console.log('length of Array: ', this.elementValueRelationshipArray.length);
        //   this.elementRelationshipArray.push(new ElementRelationship('', null,false,element.studyDesignElement,element.elementId,false))        
        // });
        // console.log('after elementRelationshipArray push: ', this.elementRelationshipArray);
      },
      error => console.log('errorn in onElement2Change: ', error)
    );
  }

  /** Get second related element on selection of first element */
  getElement2() {
    this.service.getStudyDesignElementRelationshipByName(this.element1).subscribe(
      response => {
        console.log('element relationship response: ', response);
        this.sdeLibraryRelationship$ = response;
        this.sdeLibraryRelationship$.forEach(element => {
          // remove false entry - non related
          if (element.relatesTo == false) {
            this.sdeLibraryRelationship$.pop();
          }
        });
      },
      error => console.log('error on on getStudyDesignElementRelationshipByName: ', error)
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
