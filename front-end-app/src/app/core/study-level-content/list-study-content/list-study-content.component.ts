import { Component, OnInit } from '@angular/core';
import { StudyLevelContentService } from 'src/app/services/study-level-content.service';
import { StudyLevelContent } from 'src/app/services/model/study-level-content-model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-study-content',
  templateUrl: './list-study-content.component.html',
  styleUrls: ['./list-study-content.component.css']
})
export class ListStudyContentComponent implements OnInit {

  studyLevelContentArray: StudyLevelContent[];

  constructor(private service: StudyLevelContentService, private _route: Router) { }

  ngOnInit() {
    this.getStudyLevelContent();
  }

  getStudyLevelContent() {
    this.service.getStudyLevelContent().subscribe(
      response => {
        console.log('getStudyLevelContent response: ', response);
        this.studyLevelContentArray = response;
      },
      error => console.log('Error while getting study level content: ', error)
    );
  }

  editElement(protocolId: string) {
    console.log("Id: ", protocolId);
    this._route.navigate(['study-level/edit', protocolId]);
  }


  deleteContent(id: number) {
    let deleted = false;
    this.service.deleteStudyLevelContentById(id).subscribe(
      result => console.log('deleted record for id: ' + id + ' response: ' + result),
      error => console.log('Error while deleteing sde value#deleteSdeValue', error)
    );
    this.getStudyLevelContent();
  }


}
