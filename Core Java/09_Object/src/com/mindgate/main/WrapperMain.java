package com.mindgate.main;

public class WrapperMain {
	public static void main(String[] args) {

		int i = 10;
		//boxing
		Integer number = Integer.valueOf(i);
		System.out.println(number);
		
		//Auto boxing
		Integer newNumber = i;
		System.out.println(newNumber);
		
		//Auto Unboxing
		int j = newNumber;
		
		//Unboxing
		int k = number.intValue();
		System.out.println(j);
	}
}
