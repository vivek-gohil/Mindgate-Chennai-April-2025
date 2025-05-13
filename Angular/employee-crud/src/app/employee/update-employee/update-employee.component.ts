import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../../model/employee';
import { EmployeeCrudService } from '../../service/employee-crud.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-update-employee',
  imports: [FormsModule],
  templateUrl: './update-employee.component.html',
  styleUrl: './update-employee.component.css'
})
export class UpdateEmployeeComponent implements OnInit {
  
  employeeId: number = 0;
  employee: Employee = new Employee();
  updateFlag: boolean = false;

  constructor(private router: Router, private activatedRoute: ActivatedRoute, private employeeCrudService:EmployeeCrudService) 
  { }

  updateEmployee(){
    console.log('Updated Employee Details:', this.employee);
    this.employeeCrudService.updateEmployee(this.employee).subscribe({
      next: (response) => {
        this.updateFlag = response;
        console.log('Employee details:', this.employee);
      },
      error: (error) => {
        console.log('Failed to update employee details', error);
      },
      complete: () => {
        console.log('Employee update completed');
      }
    });
  }

  backToHome(){
    this.router.navigate(['/employees']);
  }
  
  setEmployeeId() {
    this.employeeId = this.activatedRoute.snapshot.params['employeeId'];
    console.log('Employee ID:', this.employeeId);
  }
  ngOnInit(): void {
   this.setEmployeeId();
    this.employeeCrudService.getEmployeeById(this.employeeId).subscribe({
      next: (response) => {
        this.employee = response;
        console.log('Employee details:', this.employee);
      },
      error: (error) => {
        console.log('Failed to load employee details', error);
      },
      complete: () => {
        console.log('Employee loading completed');
      }
    });

  }


}
