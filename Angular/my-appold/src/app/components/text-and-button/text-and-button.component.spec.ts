import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TextAndButtonComponent } from './text-and-button.component';

describe('TextAndButtonComponent', () => {
  let component: TextAndButtonComponent;
  let fixture: ComponentFixture<TextAndButtonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TextAndButtonComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TextAndButtonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
