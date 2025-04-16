package com.mindgate.main;

import com.mindgate.main.domain.Employee;

public class MyClassMain {
	public static void main(String[] args) {
		String message = new String("Hello");
		String newMessage = new String("Hello");

		if (message.equals(newMessage)) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}

		System.out.println("-----------------------------");
		Employee employee1 = new Employee("Ashiq");
		Employee employee2 = new Employee("Ashiq");

		if (employee1.equals(employee2)) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}

		System.out.println("----------------------------------");

		if (employee1 == employee2) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}

		System.out.println(employee1);
		System.out.println(employee2.toString());
	}
}
