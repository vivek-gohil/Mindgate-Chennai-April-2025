package com.mindgate.main;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scanner.nextLine();
		System.out.println(name);
		
//		System.out.println("Enter First Number");
//		int numberOne = scanner.nextInt();
//		System.out.println("Enter First Number");
//		int numberTwo = scanner.nextInt();
//		
//		int result = numberOne + numberTwo;
//		
//		System.out.println("Addition of " + numberOne + " and " + numberTwo + " is " + result);
//	
	}

}
