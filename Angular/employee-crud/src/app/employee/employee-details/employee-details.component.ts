import { Component, OnInit } from '@angular/core';
import { Employee } from '../../model/employee';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeCrudService } from '../../service/employee-crud.service';

@Component({
  selector: 'app-employee-details',
  imports: [],
  templateUrl: './employee-details.component.html',
  styleUrl: './employee-details.component.css'
})
export class EmployeeDetailsComponent implements OnInit {
  employeeId: number = 0;
  employee: Employee = new Employee();

  constructor(private activatedRoute: ActivatedRoute, private employeeCrudService: EmployeeCrudService, private router: Router) { }

  backToHome() {
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
