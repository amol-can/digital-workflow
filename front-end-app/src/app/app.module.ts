import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SidebarComponent } from './shared/sidebar/sidebar.component';
import { HomeComponent } from './core/home/home.component';
import { StudyLevelContentComponent } from './core/study-level-content/study-level-content.component';
import { LibraryComponent } from './core/library/library.component';
import { AddElementComponent } from './core/library/add-element/add-element.component';
import { ListElementComponent } from './core/library/list-element/list-element.component';
import { EditElementComponent } from './core/library/edit-element/edit-element.component';
import { ElementValueComponent } from './core/library/element-value/element-value.component';
import { AddValueComponent } from './core/library/element-value/add-value/add-value.component';
import { ListValueComponent } from './core/library/element-value/list-value/list-value.component';
import { ElementRelationshipComponent } from './core/library/element-relationship/element-relationship.component';
import { ElementValueRelationshipComponent } from './core/library/element-value-relationship/element-value-relationship.component';
import { AddStudyContentComponent } from './core/study-level-content/add-study-content/add-study-content.component';
import { ListStudyContentComponent } from './core/study-level-content/list-study-content/list-study-content.component';
import { ProtocolLevelContentComponent } from './core/protocol-level-content/protocol-level-content.component';
import { AddProtocolContentComponent } from './core/protocol-level-content/add-protocol-content/add-protocol-content.component';
import { ListProtocolContentComponent } from './core/protocol-level-content/list-protocol-content/list-protocol-content.component';
import { ObjectiveComponent } from './core/objective/objective.component';
import { AddObjectiveComponent } from './core/objective/add-objective/add-objective.component';
import { ListObjectiveComponent } from './core/objective/list-objective/list-objective.component';




@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    HomeComponent,
    StudyLevelContentComponent,
    LibraryComponent,
    AddElementComponent,
    ListElementComponent,
    EditElementComponent,
    ElementValueComponent,
    AddValueComponent,
    ListValueComponent,
    ElementRelationshipComponent,
    ElementValueRelationshipComponent,
    AddStudyContentComponent,
    ListStudyContentComponent,
    ProtocolLevelContentComponent,
    AddProtocolContentComponent,
    ListProtocolContentComponent,
    ObjectiveComponent,
    AddObjectiveComponent,
    ListObjectiveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
