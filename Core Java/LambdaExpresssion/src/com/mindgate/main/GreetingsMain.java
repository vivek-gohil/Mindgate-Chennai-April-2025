package com.mindgate.main;

import com.mindgate.main.service.GoodAfternoonGreetingsServiceImpl;
import com.mindgate.main.service.GoodMorningGreetingsServiceImpl;
import com.mindgate.main.service.GreetingService;

public class GreetingsMain {
	public static void main(String[] args) {
		GreetingService goodMorningGreetings = new GoodMorningGreetingsServiceImpl();
		goodMorningGreetings.greet();

		System.out.println();

		GreetingService goodAfternoonGreetings = new GoodAfternoonGreetingsServiceImpl();
		goodAfternoonGreetings.greet();

		System.out.println();

		GreetingService goodEveningGreetings = () -> System.out.println("Good Evening");
		goodEveningGreetings.greet();

		System.out.println();

		GreetingService goodNightGreetings = () -> System.out.println("Good Night");
		goodNightGreetings.greet();
	}
}
