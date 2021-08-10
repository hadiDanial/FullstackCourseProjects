import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-text-and-button',
  templateUrl: './text-and-button.component.html',
  styleUrls: ['./text-and-button.component.css']
})
export class TextAndButtonComponent implements OnInit {
  @Input()
  public buttonText: string = "Go";

  @Input()
  public labelText: string = "Search";

  public insertedText : string = ""
@Output()
public onButtonClicked : EventEmitter<string> = new EventEmitter<string>();

  constructor() { }

  ngOnInit(): void {
  }

  buttonClicked() : void {
    this.onButtonClicked.emit(this.insertedText);
  }
}
