package com.mindgate.main;

import com.mindgate.main.builder.EmployeeBuilder;
import com.mindgate.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
// Case 1 = employeeId and firstName
//		EmployeeBuilder employeeBuilder = new EmployeeBuilder();
//		Employee employee = employeeBuilder.byEmployeeId(101).byFirstName("Vivek").build();
//		System.out.println(employee);

// Case 2 = employeeId , firstName , lastName
//		EmployeeBuilder employeeBuilder = new EmployeeBuilder();
//		Employee employee = employeeBuilder.byEmployeeId(101).byFirstName("Vivek").byLastName("Gohil").build();
//		System.out.println(employee);

// Case 3 = employeeId , firstName , lastName , salary
//		EmployeeBuilder employeeBuilder = new EmployeeBuilder();
//		Employee employee = employeeBuilder.byEmployeeId(101).byFirstName("Vivek").byLastName("Gohil").bySalary(1000).build();
//		System.out.println(employee);
//		
// Case 4 = employeeId , firstName , lastName , addressId , city , state 
		EmployeeBuilder employeeBuilder = new EmployeeBuilder();
		Employee employee = employeeBuilder.byEmployeeId(101).byFirstName("Vivek").byLastName("Gohil").byAddressId(1)
				.byCity("Chennai").byState("Tamil Nadu").build();
		System.out.println(employee);

	}

}
