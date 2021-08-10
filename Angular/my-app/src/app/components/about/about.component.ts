import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
  public counter : number = 0;
  constructor() { }

  ngOnInit(): void {
    // Anonymous, doesn't have access to instance variables
    setTimeout(function() { alert("Timeout!") }, 2000);
    // Lambda/arrow function, has access to instance variables
    setInterval(()=>this.counter++,500);
  }

}
