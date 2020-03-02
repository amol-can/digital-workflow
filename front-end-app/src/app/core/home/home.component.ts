import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Protocol } from './protocol.model';
import { ProtocolService } from './protocol.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  protocols$: Protocol[];
  
  constructor(private protocolService: ProtocolService) {

   }

  ngOnInit() {
    this.onGetRequest();
  }

  public onGetRequest(){
    return this.protocolService.getProtocols()
    .subscribe(data => this.protocols$ = data);
  }

}
