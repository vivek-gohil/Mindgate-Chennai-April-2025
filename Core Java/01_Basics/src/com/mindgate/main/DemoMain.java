package com.mindgate.main;

import com.mindgate.service.MyDemo;

public class DemoMain {
	public static void main(String[] args) {
		System.out.println("main start");
		//MyDemo myDemo = new MyDemo(); Hi Hello
		MyDemo myDemo = new MyDemo(10,20); // Hi 10 Hello 20
		System.out.println("main end");
	}
}
