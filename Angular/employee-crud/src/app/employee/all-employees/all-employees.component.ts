import { Component, OnInit } from '@angular/core';
import { Employee } from '../../model/employee';
import { EmployeeCrudService } from '../../service/employee-crud.service';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-all-employees',
  imports: [CommonModule],
  templateUrl: './all-employees.component.html',
  styleUrl: './all-employees.component.css'
})
export class AllEmployeesComponent implements OnInit{
  allEmployees: Employee[] = [];  
  deleteFlag: boolean = false;
  constructor(private employeeCrudService: EmployeeCrudService , private router: Router) {}

  ngOnInit(): void {
   this.loadEmployees();
  }

  updateEmployee(employeeId: number) {
    this.router.navigate(['employees/update/',employeeId]);
  }

  deleteEmployee(employeeId: number){
    console.log('Deleting employee with ID:', employeeId);
    this.employeeCrudService.deleteEmployee(employeeId).subscribe({
      next: (response) => {
          this.deleteFlag = response;
          if (this.deleteFlag) {
            console.log('Employee deleted successfully');
            this.loadEmployees();
          }
          else {
            console.log('Failed to delete employee');
          }
        },
        error: (error) => {
          console.log('Failed to delete ',error);
        },
        complete: () => {
          console.log('Employee delete operation completed');
        }
    });
  }

  loadEmployees() {
    this.employeeCrudService.getAllEmployees().subscribe(
      {
        next: (response) => {
          this.allEmployees = response;
          console.log(this.allEmployees);
        },
        error: (error) => {
          console.log('Failed to load employees',error);
        },
        complete: () => {
          console.log('Employee loading completed');
        }
      }
    );
  }
}
