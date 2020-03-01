import { Component, OnInit, ElementRef } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-study-level-content',
  templateUrl: './study-level-content.component.html',
  styleUrls: ['./study-level-content.component.css']
})
export class StudyLevelContentComponent implements OnInit {
  defaultVal = "Sample protocol";
  constructor() { }

  ngOnInit() {
  }

  onSubmit(form: NgForm){
    console.log(form)
  }

}
