package com.mindgate.main;

import com.mindgate.main.domain.Current;

public class AccountMainV5 {
	public static void main(String[] args) {
		Current current = new Current(101, "Test", 5000, 50000);

		System.out.println("Account Number = " + current.getAccountNumber());
		System.out.println("Name = " + current.getName());
		System.out.println("Balance = " + current.getBalance());
		System.out.println("Overdraft Balance = " + current.getOverdraftBalance());

		System.out.println();
		System.out.println("Withdraw = 4000");
		current.withdraw(4000);
		System.out.println("Balance = " + current.getBalance());
		System.out.println("Overdraft Balance = " + current.getOverdraftBalance());

		System.out.println();
		System.out.println("Withdraw = 10000");
		current.withdraw(10000);
		System.out.println("Balance = " + current.getBalance());
		System.out.println("Overdraft Balance = " + current.getOverdraftBalance());

		System.out.println();
		System.out.println("Withdraw = 1000");
		current.withdraw(1000);
		System.out.println("Balance = " + current.getBalance());
		System.out.println("Overdraft Balance = " + current.getOverdraftBalance());

		System.out.println();
		System.out.println("Deposit = 5000");
		current.deposit(5000);
		System.out.println("Balance = " + current.getBalance());
		System.out.println("Overdraft Balance = " + current.getOverdraftBalance());

		System.out.println();
		System.out.println("Deposit = 10000");
		current.deposit(10000);
		System.out.println("Balance = " + current.getBalance());
		System.out.println("Overdraft Balance = " + current.getOverdraftBalance());

		System.out.println();
		System.out.println("Deposit = 5000");
		current.deposit(5000);
		System.out.println("Balance = " + current.getBalance());
		System.out.println("Overdraft Balance = " + current.getOverdraftBalance());

	}
}
