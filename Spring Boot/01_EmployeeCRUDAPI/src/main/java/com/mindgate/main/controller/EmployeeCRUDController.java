package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mindgate.main.domain.Employee;
import com.mindgate.main.service.EmployeeServiceInterface;

@RestController
@RequestMapping("employeecrudapi")
@CrossOrigin("*")
public class EmployeeCRUDController {

	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;

	// http://localhost:8080/employeeapi/employees/101
	@GetMapping("employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		return employeeServiceInterface.getEmployeeByEmployeeId(employeeId);
	}

	// http://localhost:8080/employeeapi/employees/101
	@DeleteMapping("employees/{employeeId}")
	public boolean deleteEmployee(@PathVariable int employeeId) {
		return employeeServiceInterface.deleteEmployee(employeeId);
	}

	// http://localhost:8080/employeeapi/employees/employee
	@PostMapping("employees/employee")
	public boolean addEmployee(@RequestBody Employee employee) {
		return employeeServiceInterface.addNewEmployee(employee);
	}

	// http://localhost:8080/employeeapi/employees/employee
	@PutMapping("employees/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeServiceInterface.updateEmployee(employee);
	}

	// http://localhost:8080/employeeapi/employees
	@GetMapping("employees")
	public List<Employee> allEmployees() {
		return employeeServiceInterface.getAllEmployees();
	}

}
