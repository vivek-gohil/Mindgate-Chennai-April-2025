package com.mindgate.main.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mindgate.main")
public class EmployeeConfiguration {
	public EmployeeConfiguration() {
		System.out.println("EmployeeConfiguration default constructor");
	}
}
