package com.mindgate.main;

import com.mindgate.main.domain.Savings;

public class AccountMainV3 {

	public static void main(String[] args) {

		// Create Savings Account
		Savings savings = new Savings(101, "Test", 1000);

		System.out.println(savings.getAccountNumber());
		System.out.println(savings.getBalance());
		System.out.println(savings.getName());

	}

}
