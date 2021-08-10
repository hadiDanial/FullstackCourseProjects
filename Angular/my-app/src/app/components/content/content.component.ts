import { Component, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.css']
})
export class ContentComponent implements OnInit {

  public imagePath = "assets/images/cat.jpg";
  public currentDiscount: number = 15;
  public currentDate: Date = new Date();
  public originalWidth = 500;
  public imageWidth: number = this.originalWidth;

  constructor() {


  }

  ngOnInit(): void {
  }


  public doSomething(): void {
    alert('Hello')
  }

  public sayHi(name: string) {
    alert("Hi " + name);
  }

  public doMagic() {
    // this.imageWidth += 10;
    this.currentDiscount += 1;
  }

  public changeWidth(delta: number): void {
    this.imageWidth += delta;
  }

  public resetWidth() {
    this.imageWidth = this.originalWidth;
  }

  public changeDiscount(delta: number): void {
    this.currentDiscount += delta;
  }
}
