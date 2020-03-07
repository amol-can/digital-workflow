import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './core/home/home.component';
import { StudyLevelContentComponent } from './core/study-level-content/study-level-content.component';
import { LibraryComponent } from './core/library/library.component';
import { ListElementComponent } from './core/library/list-element/list-element.component';


const routes: Routes = [
  {path: "", component: HomeComponent},
  {path: "study-level", component: StudyLevelContentComponent},
  {
    path: "library-management", component: LibraryComponent,
    children: [
      {
        path: 'show',
        component: ListElementComponent
      }
    ]
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
