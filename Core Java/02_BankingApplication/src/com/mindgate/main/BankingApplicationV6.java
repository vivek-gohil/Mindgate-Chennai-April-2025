package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Account;
import com.mindgate.main.domain.Current;
import com.mindgate.main.domain.Savings;

public class BankingApplicationV6 {
	private static Scanner scanner = new Scanner(System.in);
	private static int accountNumber;
	private static String name;
	private static double balance;

	public static void acceptDetails() {
		System.out.println("Enter account number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
	}

	public static void displayDetails() {
		System.out.println("Account Number = " + accountNumber);
		System.out.println("Name = " + name);
		System.out.println("Balance = " + balance);
	}

	public static void main(String[] args) {

		Account account = null;
		int accountChoice, trainsactionChoice;
		String continueChoice, isSalaryChoice;
		boolean isSalary = false;
		double overdraftBalance;

		System.out.println(" Account Menu ");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		System.out.println("Enter your choice");
		accountChoice = scanner.nextInt();
		switch (accountChoice) {
		case 1:
			System.out.println("Do you want to create Salary account (yes || no) ");
			isSalaryChoice = scanner.next();
			if (isSalaryChoice.toUpperCase().equals("YES")) {
				isSalary = true;
			}
			acceptDetails();
			account = new Savings(accountNumber, name, balance, isSalary);
			System.out.println("Savings account created successfully !");
			displayDetails();
			System.out.println("Is salary account = " + isSalaryChoice);
			break;
		case 2:
			System.out.println("Enter overdraft balance");
			overdraftBalance = scanner.nextDouble();
			acceptDetails();
			account = new Current(accountNumber, name, balance, overdraftBalance);
			System.out.println("Current account created successfully !");
			displayDetails();
			System.out.println("Overdraft Balance " + overdraftBalance);
			break;
		default:
			System.out.println("Invalid Account Choice");
			break;
		}

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
				boolean result = account.withdraw(amount);
				if (result) {
					System.out.println("Withdraw successfull");
					System.out.println("Balance = " + account.getBalance());
					if (account instanceof Current) {
						Current current = (Current) account;
						System.out.println(current.getOverdraftBalance());
					}

				} else {
					System.out.println("Withdraw failed");
				}

				break;
			}
			case 2: {
				System.out.println("Enter amount to deposit");
				double amount = scanner.nextDouble();
				boolean result = account.deposit(amount);
				if (result) {
					System.out.println("Deposit successfull");
					System.out.println("Balance = " + account.getBalance());
					if (account instanceof Current) {
						Current current = (Current) account;
						System.out.println(current.getOverdraftBalance());
					}

				} else {
					System.out.println("Deposit failed");
				}
				break;
			}
			case 3:
				System.out.println("Balance = " + account.getBalance());
				break;
			}
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.toUpperCase().equals("YES"));
		System.out.println("Thank you");
	}
}
