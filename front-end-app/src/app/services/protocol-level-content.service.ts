import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ProtocolLevelContentModel } from './model/protocol-level-content.model';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class ProtocolLevelContentService {
  protocolLevelContentUrl = '/server/api/v0/protocol-level';

  constructor(private http: HttpClient) { }

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

  
}
