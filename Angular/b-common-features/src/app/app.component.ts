import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';

@Component({
  selector: 'app-root',
  imports: [FormsModule,FirstComponent,SecondComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name: string = 'Mindgate Chennai';
  message: string = '';
  isHidden: boolean = true;
  displayFirst: boolean = false;
  displaySecond: boolean = false;

  showFirstComponent() {
    this.displayFirst = true;
    this.displaySecond = false;
  }

    showSecondComponent() {
    this.displayFirst = false;
    this.displaySecond = true;
  }

  displayMessage() {
    this.isHidden = false;
  }

}
