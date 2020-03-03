import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Protocol } from './protocol.model';

@Injectable({
  providedIn: 'root'
})
export class ProtocolService {
  apiUrl = "server/api/v0/protocols";

  constructor(private http: HttpClient) { }

  getProtocols(){
    return this.http
    .get<Protocol[]>(this.apiUrl);
  }

}
