package com.mindgate.main;

import java.util.Arrays;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.domain.SortEmployeeByName;
import com.mindgate.main.domain.SortEmployeeBySalary;

public class ArrayMain {
	public static void main(String[] args) {
		int[] numbers = { 432, 22, 12, 43, 634 };

		System.out.println(numbers);
		System.out.println("-------------------------");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("-------------------------");
		for (int i : numbers) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(numbers));

		System.out.println("-------------------------");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		Employee[] employees = new Employee[3];

		Employee employee1 = new Employee(11, "Ashiq", 50000);
		Employee employee2 = new Employee(102, "Manoj", 20000);
		Employee employee3 = new Employee(3, "Deepak", 30000);

		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		System.out.println("After sorting by employeeId");
		Arrays.sort(employees);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("After sorting by name");
		SortEmployeeByName byName = new SortEmployeeByName();
		Arrays.sort(employees, byName);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("After sorting by salary");
		SortEmployeeBySalary bySalary = new SortEmployeeBySalary();
		Arrays.sort(employees, bySalary);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}










