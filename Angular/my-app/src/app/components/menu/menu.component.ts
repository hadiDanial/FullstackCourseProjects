import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  public products: string[] = ["Product1", "Product2", "Product3", "Product4", "Product5", "Product6", "Product7"]
  constructor() { }

  ngOnInit(): void {
  }

}
