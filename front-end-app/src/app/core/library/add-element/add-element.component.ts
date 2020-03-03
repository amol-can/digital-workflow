import { Component, OnInit, AfterViewInit } from '@angular/core';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';
import { LibraryService } from 'src/app/services/library.service';

@Component({
  selector: 'app-add-element',
  templateUrl: './add-element.component.html',
  styleUrls: ['./add-element.component.css']
})
export class AddElementComponent implements OnInit, AfterViewInit {

  sdElement = new StudyDesignElement("", "", "", false, "", false, false);

  constructor(private lbService: LibraryService) { }

  ngOnInit() {

  }

  ngAfterViewInit(): void {

  }

  onAddElement() {

    console.log('custome data: ', this.sdElement);
    this.lbService.addStudyDesignElement(this.sdElement);
  }



}
