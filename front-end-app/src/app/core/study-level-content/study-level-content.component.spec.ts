import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudyLevelContentComponent } from './study-level-content.component';

describe('StudyLevelContentComponent', () => {
  let component: StudyLevelContentComponent;
  let fixture: ComponentFixture<StudyLevelContentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudyLevelContentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudyLevelContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
