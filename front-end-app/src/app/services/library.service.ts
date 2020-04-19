import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';
import { StudyDesignElement } from './StudyDesignElement';
import { StudyDesignElementValue } from './model/sde-value-model';
import { ElementRelationship } from './model/element-relation-model';
import { ElementValueRelationship } from './model/sde-value-relation-model';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json,Origin',
    'Access-Control-Allow-Headers': 'Cache-Control',
    'Access-Control-Allow-Methods': 'GET,POST,PATCH,DELETE,PUT,OPTIONS',
    'Access-Control-Allow-Origin':'*'
  })
};

@Injectable({
  providedIn: 'root'
})
export class LibraryService {

  libraryUrl = "/server/api/v0/reference-library";
  libraryValueUrl = "/server/api/v0/reference-value";
  elementRelationshipUrl = '/server/api/v0/library-relationship';
  elementValueRelationshipUrl = '/server/api/v0/value-relationship'

  constructor(private http: HttpClient) { }

  /* 1. Study Design Element APIs */

  addStudyDesignElement(data: StudyDesignElement): Observable<any> {
    console.log('custome post request data: ', data)
    return this.http.post(this.libraryUrl, data, httpOptions);
  }

  getStudyDesignElement(): Observable<any> {
    return this.http.get<StudyDesignElement>(this.libraryUrl, httpOptions);
  }

  findStudyDesignElement(id: any): Observable<any> {
    return this.http.get<StudyDesignElement>(this.libraryUrl + "/" + id, httpOptions);
  }

  /* 2. Study Design Element Value APIs */
  getStudyDesignElementValue(): Observable<any> {
    return this.http.get<StudyDesignElementValue>(this.libraryValueUrl, httpOptions);
  }

  getStudyDesignElementValueByName(elementName: any): Observable<any> {
    return this.http.get<StudyDesignElementValue>(this.libraryValueUrl, {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
      params: {
        elementName: elementName
      },
    });
  }

  addStudyDesignElementValue(data: StudyDesignElementValue): Observable<any> {
    return this.http.post<StudyDesignElementValue>(this.libraryValueUrl, data, httpOptions);
  }

  findStudyDesignElementValue(id: any): Observable<any> {
    return this.http.get<StudyDesignElementValue>(this.libraryValueUrl + "/" + id, httpOptions);
  }

  studyDesignElementValueDelete(id: any): Observable<any> {
    return this.http.delete(this.libraryValueUrl + "/" + id, httpOptions);
  }

  /* 3. Element relationship APIs */
  addStudyDesignElementRelationship(element: ElementRelationship): Observable<any> {
    return this.http.post<ElementRelationship>(this.elementRelationshipUrl, element, httpOptions);
  }

  getStudyDesignElementRelationship(elementName: String): Observable<any> {
    return this.http.get<ElementRelationship>(this.elementRelationshipUrl + "/" + elementName, httpOptions);
  }

  getStudyDesignElementRelationshipByName(sdElementName: string): Observable<any> {
    return this.http.get<ElementRelationship>(this.elementRelationshipUrl, {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
      params: {
        elementName: sdElementName
      },
    });
  }

  /* 4. Element Value Relationship */
  addStudyElementValueRelationship(element: ElementValueRelationship): Observable<any> {
    return this.http.post<ElementValueRelationship>(this.elementValueRelationshipUrl, element, httpOptions);
  }

  getStudyElementValueRelationship(): Observable<any> {
    return this.http.get<ElementValueRelationship>(this.elementValueRelationshipUrl, httpOptions);
  }

}
