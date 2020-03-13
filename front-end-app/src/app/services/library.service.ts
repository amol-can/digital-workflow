import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { StudyDesignElement } from './StudyDesignElement';
import { StudyDesignElementValue } from './model/sde-value-model';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class LibraryService {

  libraryUrl = "/server/api/v0/reference-library";
  libraryValueUrl = "/server/api/v0/reference-value"

  constructor(private http: HttpClient) { }

  /* Study Design Element APIs */

  addStudyDesignElement(data: StudyDesignElement) : Observable<any> {
    console.log('custome post request data: ',data)
    return this.http.post(this.libraryUrl, data, httpOptions);
  }

  getStudyDesignElement() : Observable<any>{
    return this.http.get<StudyDesignElement>(this.libraryUrl,httpOptions);
  }

  findStudyDesignElement(id: any): Observable<any>{
    return this.http.get<StudyDesignElement>(this.libraryUrl+"/"+id,httpOptions);
  }

  /* Study Design Element Value APIs */
  getStudyDesignElementValue(): Observable<any>{
    return this.http.get<StudyDesignElementValue>(this.libraryValueUrl,httpOptions);
  }

}
