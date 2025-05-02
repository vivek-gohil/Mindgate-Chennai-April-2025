package com.mindgate.main.domain;

public class Employee {

	private int employeeId;
	private String name;
	private double salary;
	private Address residentialAddress;

	public Employee() {
		System.out.println("Employee Default construtor");

	}

	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee parameterized-3 parameters  construtor");
	}
	public Employee(int employeeId, String name, double salary, Address residentialAddress) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.residentialAddress = residentialAddress;
		System.out.println("Employee parameterized construtor");
	}

	public int getEmployeeId() {
		System.out.println("getEmployeeId()");
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("setEmployeeId() " + employeeId);
		this.employeeId = employeeId;
	}

	public String getName() {
		System.out.println("getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName() " + name);
		this.name = name;
	}

	public double getSalary() {
		System.out.println("getSalary()");
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("setSalary()" + salary);
		this.salary = salary;
	}

	public Address getResidentialAddress() {
		System.out.println("getResidentialAddress() ");
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		System.out.println("setResidentialAddress() " + residentialAddress);
		this.residentialAddress = residentialAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", residentialAddress="
				+ residentialAddress + "]";
	}

}
