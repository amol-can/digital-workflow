import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { StudyLevelContent } from './model/study-level-content-model';
import { Observable } from 'rxjs';

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

  studyLevelContentUrl = '/server/api/v0/study-level';

  addStudyLevelContent(element : StudyLevelContent): Observable<any>{
    return this.http.post<StudyLevelContent>(this.studyLevelContentUrl,element,httpOptions);
  }

  getStudyLevelContent():Observable<any>{
    return this.http.get<StudyLevelContent>(this.studyLevelContentUrl,httpOptions);
  }

}
