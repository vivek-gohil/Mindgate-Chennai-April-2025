package com.mindgate.service;

public class MyDemo extends Demo {
	public MyDemo() {
		System.out.println("Hello");
	}

	public MyDemo(int x, int y) {
		super(x);
		System.out.println("Hello " + y);
	}
}
