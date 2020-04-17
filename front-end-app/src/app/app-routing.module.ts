import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './core/home/home.component';
import { StudyLevelContentComponent } from './core/study-level-content/study-level-content.component';
import { LibraryComponent } from './core/library/library.component';
import { ListElementComponent } from './core/library/list-element/list-element.component';
import { AddElementComponent } from './core/library/add-element/add-element.component';
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


const routes: Routes = [
  { path: "", component: HomeComponent },
  {
    path: "library-management", component: LibraryComponent,
    children: [
      { path: "", component: AddElementComponent },
      { path: "add", component: AddElementComponent },
      { path: "show", component: ListElementComponent },
      { path: "edit", component: EditElementComponent },
      { path: "edit/:id", component: AddElementComponent }
    ]
  },
  {
    path: "element-values", component: ElementValueComponent,
    children: [
      { path: "", component: AddValueComponent },
      { path: "add", component: AddValueComponent },
      { path: "show", component: ListValueComponent },
      { path: "edit/:id", component: AddValueComponent }
    ]
  },
  { path: "element-relationship", component: ElementRelationshipComponent },
  { path: "element-value-relationship", component: ElementValueRelationshipComponent },

  {
    path: "study-level", component: StudyLevelContentComponent,
    children: [
      { path: "", component: AddStudyContentComponent },
      { path: "add", component: AddStudyContentComponent },
      { path: "show", component: ListStudyContentComponent },
      { path: "edit/:id", component: AddStudyContentComponent },
    ]
  },

  {
    path: "protocol-level", component: ProtocolLevelContentComponent,
    children: [
      { path: "", component: AddProtocolContentComponent },
      { path: "add", component: AddProtocolContentComponent },
      { path: "show", component: ListProtocolContentComponent },
      { path: "edit/:id", component: AddProtocolContentComponent },
    ]
  },
  {
    path:"objective", component:ObjectiveComponent,
    children:[
      { path: "", component: AddObjectiveComponent },
      { path: "add", component: AddObjectiveComponent },
    ]
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
