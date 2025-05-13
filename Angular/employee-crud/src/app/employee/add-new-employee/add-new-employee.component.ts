import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Employee } from '../../model/employee';
import { EmployeeCrudService } from '../../service/employee-crud.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-new-employee',
  imports: [FormsModule],
  templateUrl: './add-new-employee.component.html',
  styleUrl: './add-new-employee.component.css'
})
export class AddNewEmployeeComponent {
  employee: Employee = new Employee();
  insertFlag: boolean = false;

  constructor(private employeeCrudService: EmployeeCrudService ,private router: Router) { }

  backToHome() {
    this.router.navigate(['/employees']);
  }
  
  saveEmployee() {
    this.employeeCrudService.addNewEmployee(this.employee).subscribe({
      next: (response) => {
        this.insertFlag = response;
        if (this.insertFlag) {
          console.log('Employee added successfully');
        } else {
          console.log('Failed to add employee');
        }
      },
      error: (error) => {
        console.log('Failed to add new employee', error);
      },
      complete: () => {
        console.log('Employee processing completed successfully');
      }
    });
  }

  addNewEmployee() {
    console.log('New Employee Details:', this.employee);
    this.saveEmployee();
  }

}
