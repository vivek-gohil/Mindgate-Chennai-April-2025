package com.mindgate.main.domain;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;
	private Address address;

	private Employee() {
		// TODO Auto-generated constructor stub
	}

	public static Employee getEmployee() {
		return new Employee();
	}
//	public Employee() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Employee(int employeeId, String firstName, String lastName, double salary) {
//		super();
//		this.employeeId = employeeId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.salary = salary;
//	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", address=" + address + "]";
	}

}
