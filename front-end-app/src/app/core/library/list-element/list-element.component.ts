import { Component, OnInit, AfterViewInit } from '@angular/core';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';

@Component({
  selector: 'app-list-element',
  templateUrl: './list-element.component.html',
  styleUrls: ['./list-element.component.css']
})
export class ListElementComponent implements OnInit, AfterViewInit {
  sdElements$: StudyDesignElement[];
  constructor(private lbService: LibraryService) { }

  ngOnInit() {
    
  }

  ngAfterViewInit(): void { 
    this.lbService.getStudyDesignElement().subscribe(
      response => this.sdElements$ = response,
      error => console.log('Error: ', error) 
    );
  }

}
