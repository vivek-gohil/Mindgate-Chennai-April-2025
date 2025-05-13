import { Component } from '@angular/core';
import { Employee } from '../model/employee';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-second',
  imports: [CommonModule],
  templateUrl: './second.component.html',
  styleUrl: './second.component.css'
})
export class SecondComponent {
 employee1: Employee = new Employee(101,'Rakesh', 10000);
 employee2: Employee = new Employee(102,'Naren', 10000);
 employee3: Employee = new Employee(103,'Divya', 10000);

 allEmployees: Employee[] = [ this.employee1, this.employee2, this.employee3 ]; 


}
