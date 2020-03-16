import { Component, OnInit, AfterViewInit } from '@angular/core';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElementValue } from 'src/app/services/model/sde-value-model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-value',
  templateUrl: './list-value.component.html',
  styleUrls: ['./list-value.component.css']
})
export class ListValueComponent implements OnInit, AfterViewInit {

  sdeValues$: StudyDesignElementValue[];
  uniqueSde = new Map();

  constructor(private valueService: LibraryService, private _route: Router) { }

  ngOnInit() {
    this.getElementValues();
  }

  getElementValues() {
    this.valueService.getStudyDesignElementValue().subscribe(
      response => this.sdeValues$ = response,
      error => console.log('Error while calling sde value: ', error)
    );
  }

  ngAfterViewInit(): void {
    
  }

  editElement(element: StudyDesignElementValue){
    console.log("Id: ",element.elementValuesId);
    this._route.navigate(['element-values/edit',element.elementValuesId]);
  }

  deleteSdeValue(id : number){
    let deleted = false;
    this.valueService.studyDesignElementValueDelete(id).subscribe(
      result => console.log('deleted record for id: '+ id+' response: '+ result),
      error => console.log('Error while deleteing sde value#deleteSdeValue', error)
    );
    this.getElementValues();
  }


}
