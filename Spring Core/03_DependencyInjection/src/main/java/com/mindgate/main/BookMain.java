package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.main.domain.Book;
import com.mindgate.main.service.BookServiceImpl;
import com.mindgate.main.service.BookServiceInterface;

public class BookMain {
	public static void main(String[] args) {
		System.out.println("main start");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfigMetadata.xml");
		System.out.println("applicationContext created");
		BookServiceInterface bookServiceInterface = applicationContext.getBean("bookServiceImpl",
				BookServiceImpl.class);

		Book book = new Book(101, "Spring In Action");
		bookServiceInterface.addNewBook(book);

		System.out.println("-------------------------------");

		BookServiceInterface bookServiceInterface2 = applicationContext.getBean("bookServiceImpl",
				BookServiceImpl.class);

		Book book2 = new Book(102, "Java");
		bookServiceInterface2.addNewBook(book2);
		System.out.println("main end");

	}
}








