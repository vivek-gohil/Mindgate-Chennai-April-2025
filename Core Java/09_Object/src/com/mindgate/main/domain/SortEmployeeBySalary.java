package com.mindgate.main.domain;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) e1.getSalary() - (int) e2.getSalary();
	}

}
