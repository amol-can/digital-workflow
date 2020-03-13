import { Component, OnInit, AfterViewInit } from '@angular/core';
import { StudyDesignElementValue } from 'src/app/services/model/sde-value-model';
import { LibraryService } from 'src/app/services/library.service';


@Component({
  selector: 'app-add-value',
  templateUrl: './add-value.component.html',
  styleUrls: ['./add-value.component.css']
})
export class AddValueComponent implements OnInit, AfterViewInit {
  sdeValueModel: StudyDesignElementValue;
  sdeValues$: StudyDesignElementValue[];

  sdeValue = new StudyDesignElementValue('', '', 0, '', null);

  constructor(private valueService: LibraryService) { }

  ngOnInit() {

  }

  ngAfterViewInit(): void {
    this.getElementValues();
    
  }

  getElementValues() {
    this.valueService.getStudyDesignElementValue().subscribe(
      response => this.sdeValues$ = response,
      error => console.log('Error: ', error)
    );
  }


}
