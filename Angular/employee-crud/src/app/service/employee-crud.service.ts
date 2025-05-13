import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeCrudService {
  baseUrl: string = 'http://localhost:8080/employeecrudapi/employees';

  constructor(private httpClient: HttpClient) { }

  updateEmployee(employee: Employee) : Observable<boolean> {
    return this.httpClient.put<boolean>(this.baseUrl + '/employee', employee);
  }

  getEmployeeById(employeeId: number): Observable<Employee>{
    return this.httpClient.get<Employee>(this.baseUrl + '/employee/' + employeeId);
  }

  deleteEmployee(employeeId: number) : Observable<boolean> {
    return this.httpClient.delete<boolean>(this.baseUrl + '/employee/' + employeeId);  
  }

  addNewEmployee(employee: Employee): Observable<boolean> {
    return this.httpClient.post<boolean>(this.baseUrl+'/employee',employee);
  }

  getAllEmployees(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(this.baseUrl);
  }

}
