import { Component, OnInit } from '@angular/core';
import { ProtocolLevelContentModel } from 'src/app/services/model/protocol-level-content.model';
import { ProtocolLevelContentService } from 'src/app/services/protocol-level-content.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-protocol-content',
  templateUrl: './list-protocol-content.component.html',
  styleUrls: ['./list-protocol-content.component.css']
})
export class ListProtocolContentComponent implements OnInit {
  protocolLevelContentArray: ProtocolLevelContentModel[];

  constructor(private service: ProtocolLevelContentService,private _route: Router) { }

  ngOnInit() {
    this.getProtocolLevelContent();
  }

  getProtocolLevelContent() {
    this.service.getProtocolLevelContent().subscribe(
      response => {
        console.log('getStudyLevelContent response: ', response);
        this.protocolLevelContentArray = response;
      },
      error => console.log('Error while getting study level content: ', error)
    );
  }

  editElement(protocolId: string) {
    console.log("Id: ", protocolId);
    this._route.navigate(['protocol-level/edit', protocolId]);
  }  

  deleteContent(protocolId: String){
    this.service.deleteProtocolLevelContentById(protocolId).subscribe(
      result => console.log('record deleted', result),
      error => console.log('error while deleting record', error)
    );
    this.getProtocolLevelContent();
  }



}
