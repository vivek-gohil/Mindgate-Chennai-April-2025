import { Component } from '@angular/core';
import { MultiplicationTableComponent } from "./multiplication-table/multiplication-table.component";

@Component({
  selector: 'app-root',
  imports: [ MultiplicationTableComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'c-multiplication-deom';

  flag: boolean = true;

  display() {
    this.flag = false;
    console.log("flag", this.flag); 
    
  }

}
