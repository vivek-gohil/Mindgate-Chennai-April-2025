package com.mindgate.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.mindgate.main") // optional
public class HelloWorldConfiguration {
	public HelloWorldConfiguration() {
		System.out.println("HelloWorldConfiguration constructor");
	}

	@Bean
	public ViewResolver getViewResolver() {
		System.out.println("getViewResolver()");
		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver("WEB-INF/jsp/", ".jsp");
		return resourceViewResolver;
	}
}
