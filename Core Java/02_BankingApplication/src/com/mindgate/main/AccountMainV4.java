package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Savings;

public class AccountMainV4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Savings savings = new Savings();
		String continueChoice;
		boolean isSalary;

		System.out.println("Enter account number");
		long accountNumber = scanner.nextLong();
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter balance");
		double balance = scanner.nextDouble();
		System.out.println("Do you want to open salary account");
		String salaryChoice = scanner.next();

		if (salaryChoice.toUpperCase().equals("YES"))
			isSalary = true;
		else
			isSalary = false;

		savings.setAccountNumber(accountNumber);
		savings.setName(name);
		savings.setBalance(balance);
		savings.setSalary(isSalary);

		System.out.println("Account Number = " + savings.getAccountNumber());
		System.out.println("Name = " + savings.getName());
		System.out.println("Balance = " + savings.getBalance());
		System.out.println("Is salary account = " + savings.isSalary());

		do {
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");

			System.out.println("Enter your choice");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter amount to withdraw");
				double amount = scanner.nextDouble();
				boolean result = savings.withdraw(amount);
				if (result) {
					System.out.println("Withdraw successfull");
					System.out.println("Balance = " + savings.getBalance());

				} else {
					System.out.println("Withdraw failed");
				}

				break;
			}
			case 2: {
				System.out.println("Enter amount to deposit");
				double amount = scanner.nextDouble();
				boolean result = savings.deposit(amount);
				if (result) {
					System.out.println("Deposit successfull");
					System.out.println("Balance = " + savings.getBalance());

				} else {
					System.out.println("Deposit failed");
				}
				break;
			}
			case 3:
				System.out.println("Balance = " + savings.getBalance());
				break;
			}
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.toUpperCase().equals("YES"));
		System.out.println("Thank you");

	}
}
