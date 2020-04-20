import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ProtocolLevelContentModel } from './model/protocol-level-content.model';
import { Observable } from 'rxjs';
import { Objective } from './model/objective.model';
import * as appConfig from '../shared/config/globalConfig';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class ProtocolLevelContentService {
  protocolLevelContentUrl = appConfig.BASE_API_URL+'protocol-level';
  objectiveUrl = appConfig.BASE_API_URL+'objective-data';

  constructor(private http: HttpClient) { }

  // 1. Protocol Level

  addProtocolLevelContent(element : ProtocolLevelContentModel): Observable<any>{
    return this.http.post<ProtocolLevelContentModel>(this.protocolLevelContentUrl,element,httpOptions);
  }

  getProtocolLevelContent():Observable<any>{
    return this.http.get<ProtocolLevelContentModel>(this.protocolLevelContentUrl,httpOptions);
  }

  findProtocolLevelContentById(id: any): Observable<any>{
    return this.http.get<ProtocolLevelContentModel>(this.protocolLevelContentUrl+"/"+id,httpOptions);
  }

  deleteProtocolLevelContentById(id: any): Observable<any>{
    return this.http.delete<ProtocolLevelContentModel>(this.protocolLevelContentUrl+'/'+id,httpOptions);
  }

  // 2. Objective
  addObjective(element : Objective): Observable<any>{
    return this.http.post<Objective>(this.objectiveUrl,element,httpOptions);
  }

  getObjective():Observable<any>{
    return this.http.get<Objective>(this.objectiveUrl,httpOptions);
  }

  findObjectiveById(id: any): Observable<any>{
    return this.http.get<Objective>(this.objectiveUrl+"/"+id,httpOptions);
  }

  deleteObjectiveById(id: any): Observable<any>{
    return this.http.delete<Objective>(this.objectiveUrl+'/'+id,httpOptions);
  }

  
}
