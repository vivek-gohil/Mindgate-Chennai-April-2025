import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-multiplication-table',
  imports: [FormsModule, CommonModule],
  templateUrl: './multiplication-table.component.html',
  styleUrl: './multiplication-table.component.css'
})
export class MultiplicationTableComponent {
  numberForTable: number = 0;
  tableFlag: boolean = true;
  series: number[] = [1,2,3,4,5,6,7,8,9,10];

  displayTable() {
    this.tableFlag = false;
  }
}
