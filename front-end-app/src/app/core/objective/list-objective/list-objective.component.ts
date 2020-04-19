import { Component, OnInit } from '@angular/core';
import { ProtocolLevelContentService } from 'src/app/services/protocol-level-content.service';
import { Objective } from 'src/app/services/model/objective.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-objective',
  templateUrl: './list-objective.component.html',
  styleUrls: ['./list-objective.component.css']
})
export class ListObjectiveComponent implements OnInit {
  objectiveArray: Objective[];
  constructor(private objectService:ProtocolLevelContentService, private _route: Router) { }

  ngOnInit() {
    this.getObjectList();
  }

  getObjectList(){
    this.objectService.getObjective().subscribe(
      response => {
        //console.log("objective response: ", response),
          this.objectiveArray = response
      },
      error => console.log('Error while getting objective data', error)
    );
  }

  editElement(protocolId:number){
    console.log("Id: ", protocolId);
    this._route.navigate(['objective/edit', protocolId]);
  }

  deleteContent(id: number) {
    let deleted = false;
    this.objectService.deleteObjectiveById(id).subscribe(
      result => {
        console.log('deleted record for id: ' + id + ' response: ' + result),
        this.getObjectList()
      },
      error => console.log('Error while deleteing sde value#deleteSdeValue', error)
    );
    this.getObjectList();
  }


}
