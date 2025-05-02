package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.main.configuration.EmployeeConfiguration;
import com.mindgate.main.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfigMetadata.xml");
//
//		Employee employee = applicationContext.getBean("employee", Employee.class);
//
//		System.out.println(employee);

		ApplicationContext applicationContext 
						= new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		
		Employee employee = applicationContext.getBean("employee", Employee.class);

		System.out.println(employee);

	}
}













