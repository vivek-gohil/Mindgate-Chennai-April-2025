import { Routes } from '@angular/router';
import { AllEmployeesComponent } from './employee/all-employees/all-employees.component';
import { AddNewEmployeeComponent } from './employee/add-new-employee/add-new-employee.component';
import { UpdateEmployeeComponent } from './employee/update-employee/update-employee.component';
import { EmployeeDetailsComponent } from './employee/employee-details/employee-details.component';

export const routes: Routes = [
    { path: '', redirectTo: 'employees', pathMatch: 'full' },
    { path: 'employees', component: AllEmployeesComponent },
    { path: 'employees/addnew', component: AddNewEmployeeComponent },
    { path: 'employees/update/:employeeId', component: UpdateEmployeeComponent },
    { path: 'employees/details/:employeeId', component: EmployeeDetailsComponent }
];
