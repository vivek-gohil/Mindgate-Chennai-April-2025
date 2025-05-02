package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.main.domain.Address;
import com.mindgate.main.domain.Employee;

public class AddressMain {
	public static void main(String[] args) {

		// Creating Spring Container - location and name of conf metatdata file
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfigMetadata.xml");

		Address address = applicationContext.getBean("address", Address.class);
		System.out.println(address);

		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);

	}
}
