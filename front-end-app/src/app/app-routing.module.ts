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


const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "study-level", component: StudyLevelContentComponent },
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
      { path: "add", component: AddValueComponent }
    ]
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
