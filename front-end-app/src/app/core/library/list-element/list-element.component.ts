import { Component, OnInit, AfterViewInit } from '@angular/core';
import { LibraryService } from 'src/app/services/library.service';
import { StudyDesignElement } from 'src/app/services/StudyDesignElement';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-list-element',
  templateUrl: './list-element.component.html',
  styleUrls: ['./list-element.component.css']
})
export class ListElementComponent implements OnInit, AfterViewInit {
  sdElements$: StudyDesignElement[];

  constructor(private lbService: LibraryService, private _route: Router) { }

  ngOnInit() {
    
  }

  ngAfterViewInit(): void { 
    this.lbService.getStudyDesignElement().subscribe(
      response => this.sdElements$ = response,
      error => console.log('Error: ', error) 
    );
  }

  editElement(element: StudyDesignElement){
    console.log("Id: ",element.elementId);
    this._route.navigate(['library-management/edit',element.elementId]);
  }

}
