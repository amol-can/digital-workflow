import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { StudyLevelContent } from './model/study-level-content-model';
import { Observable } from 'rxjs';
import * as appConfig from '../shared/config/globalConfig';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class StudyLevelContentService {

  constructor(private http: HttpClient) { }

  studyLevelContentUrl = appConfig.BASE_API_URL+'study-level';

  addStudyLevelContent(element : StudyLevelContent): Observable<any>{
    return this.http.post<StudyLevelContent>(this.studyLevelContentUrl,element,httpOptions);
  }

  getStudyLevelContent():Observable<any>{
    return this.http.get<StudyLevelContent>(this.studyLevelContentUrl,httpOptions);
  }

  findStudyLevelContentById(id: any): Observable<any>{
    return this.http.get<StudyLevelContent>(this.studyLevelContentUrl+"/"+id,httpOptions);
  }

  deleteStudyLevelContentById(id: any): Observable<any>{
    return this.http.delete<StudyLevelContent>(this.studyLevelContentUrl+'/'+id,httpOptions);
  }

}
