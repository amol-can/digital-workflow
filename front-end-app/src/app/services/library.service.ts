import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { StudyDesignElement } from './StudyDesignElement';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class LibraryService {

  constructor(private http: HttpClient) { }

  addStudyDesignElement(data: StudyDesignElement) {
    console.log('custome data: ',data)
    this.http.post(
      "/server/api/v0/reference-library", data, httpOptions).subscribe(responseData => {
        console.log('postResponseData', responseData)
      });
  }

}
