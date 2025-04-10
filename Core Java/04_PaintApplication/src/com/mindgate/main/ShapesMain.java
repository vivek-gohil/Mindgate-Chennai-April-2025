package com.mindgate.main;

import java.awt.Shape;
import java.util.Scanner;

import com.mindgate.main.domain.Circle;
import com.mindgate.main.domain.Shapes;
import com.mindgate.main.domain.Triangle;

public class ShapesMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shapes shapes = null;
		do {
			System.out.println("1. Draw Circle");
			System.out.println("2. Draw Triangle");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				shapes = new Circle();
				break;
			case 2:
				shapes = new Triangle();
				break;
			default:
				System.out.println("Invalid Choice");
				shapes = null;
				break;
			}

			if (shapes != null) {
				shapes.draw();
			}

		} while (true);
	}
}
