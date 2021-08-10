import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
  styleUrls: ['./layout.component.css']
})
export class LayoutComponent implements OnInit {

  public currentDiscount : number = 10;
  public currentDate : Date = new Date();
  constructor() { }

  ngOnInit(): void {
  }

}
