package com.mindgate.main.builder;

import com.mindgate.main.domain.Address;
import com.mindgate.main.domain.Employee;

public class EmployeeBuilder {
	private Employee employee;
	private Address address;

	public EmployeeBuilder() {
		address = Address.getAddress();
		employee = Employee.getEmployee();
		employee.setAddress(address);
	}

	public EmployeeBuilder byAddressId(int addressId) {
		address.setAddressId(addressId);
		return this;
	}

	public EmployeeBuilder byBlock(String block) {
		address.setBlock(block);
		return this;
	}

	public EmployeeBuilder byStreet(String street) {
		address.setStreet(street);
		return this;
	}

	public EmployeeBuilder byLandMark(String landmark) {
		address.setLandmark(landmark);
		return this;
	}

	public EmployeeBuilder byCity(String city) {
		address.setCity(city);
		return this;
	}

	public EmployeeBuilder byState(String state) {
		address.setState(state);
		return this;
	}

	public EmployeeBuilder byPin(String pin) {
		address.setPin(pin);
		return this;
	}

	public EmployeeBuilder byEmployeeId(int employeeId) {
		employee.setEmployeeId(employeeId);
		return this;
	}

	public EmployeeBuilder byFirstName(String firstName) {
		employee.setFirstName(firstName);
		return this;
	}

	public EmployeeBuilder byLastName(String lastName) {
		employee.setLastName(lastName);
		return this;
	}

	public EmployeeBuilder bySalary(double salary) {
		employee.setSalary(salary);
		return this;
	}

	public Employee build() {
		return employee;
	}
}
