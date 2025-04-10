package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		String continueChoice;

		System.out.println("Enter account number");
		long accountNumber = scanner.nextLong();
		// scanner.nextLine();
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter balance");
		double balance = scanner.nextDouble();

		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("Account Number = " + account.getAccountNumber());
		System.out.println("Name = " + account.getName());
		System.out.println("Balance = " + account.getBalance());

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
