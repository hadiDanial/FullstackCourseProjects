import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-thumbnail',
  templateUrl: './thumbnail.component.html',
  styleUrls: ['./thumbnail.component.css']
})
export class ThumbnailComponent implements OnInit {
  @Input()
  public imageSource : string = "https://i.pinimg.com/originals/03/e1/b0/03e1b0207489ad32d10b9a860ffc6623.png";
  @Input()
  public labelText : string = "The best or nothing";
  @Input()
  public width : number = 50;
  constructor() { }

  ngOnInit(): void {
  }

}
