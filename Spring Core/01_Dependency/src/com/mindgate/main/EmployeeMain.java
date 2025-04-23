package com.mindgate.main;

import com.mindgate.main.domain.Address;
import com.mindgate.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		
		System.out.println("1. Using parameterized constructor");
		Address address = new Address(58, "B", "Ragahava Nagar", "Chennai", 600091);
		Employee employee = new Employee(101, "Naren", 50000, address);
		System.out.println(employee);
		
		System.out.println("------------------------------");
		
		System.out.println("2. Using Setters");
		Address address2 = new Address();
		address2.setAddressId(58);
		address2.setBlock("b");
		address2.setStreet("Ragahava Nagar");
		address2.setCity("Chennai");
		address2.setPin(600091);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(101);
		employee2.setName("Naren");
		employee2.setSalary(50000);
		employee2.setResidentialAddress(address2);
		System.out.println(employee2);

		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Main End");
	}

}
