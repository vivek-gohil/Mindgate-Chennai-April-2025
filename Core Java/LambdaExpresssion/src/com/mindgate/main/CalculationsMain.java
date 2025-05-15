package com.mindgate.main;

import com.mindgate.main.service.CalculationsService;

public class CalculationsMain {

	public static void main(String[] args) {
		CalculationsService additionService = (double numberOne,double numberTwo) -> {
			return numberOne + numberTwo;
		};
		
		double result = additionService.calculate(10, 20);
		System.out.println(result);
		
		System.out.println();
		
		int a = 10;
		//CalculationsService add = (x,y) -> x+y;
		CalculationsService add = (x,y) ->  {
			System.out.println(a);
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			return	x+y;
		};
		
		System.out.println(add.calculate(10, 20));
		
	}

}
