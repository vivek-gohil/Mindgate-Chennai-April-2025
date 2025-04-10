package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.service.AdditionService;

public class AdditionMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOne , numberTwo , result;
		
		System.out.println("Enter first number");
		numberOne = scanner.nextInt();
		System.out.println("Enter second number");
		numberTwo = scanner.nextInt();
		
		AdditionService additionService = new AdditionService();
		result = additionService.addition(numberOne, numberTwo);
		
		System.out.println("Addition is " + result);
		
		scanner.close();
	}

}







