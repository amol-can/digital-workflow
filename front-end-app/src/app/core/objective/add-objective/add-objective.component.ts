import { Component, OnInit, AfterViewInit } from '@angular/core';
import { StudyLevelContentService } from 'src/app/services/study-level-content.service';
import { StudyLevelContent } from 'src/app/services/model/study-level-content-model';

@Component({
  selector: 'app-add-objective',
  templateUrl: './add-objective.component.html',
  styleUrls: ['./add-objective.component.css']
})
export class AddObjectiveComponent implements OnInit, AfterViewInit {
  studyLevelContentArray: StudyLevelContent[];

  constructor(private studyService: StudyLevelContentService) { }

  ngOnInit() {
    this.getStudyLevelContent();
  }
  ngAfterViewInit(): void{
 
  }

  /* For search Box */
  getStudyLevelContent() {
    this.studyService.getStudyLevelContent().subscribe(
      response =>{
        console.log('response: ', response),
        this.studyLevelContentArray = response
      } ,
      error => console.log('Error while getting study level content: ', error)
    );
  }

}
