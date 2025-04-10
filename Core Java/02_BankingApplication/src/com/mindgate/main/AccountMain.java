package com.mindgate.main;

import com.mindgate.main.domain.Account;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("Mindgate Chennai");
		account.setBalance(50000);
		System.out.println("Account Number = " + account.getAccountNumber());
		System.out.println("Name = " + account.getName());
		System.out.println("Balance = " + account.getBalance());

		System.out.println();

		System.out.println("withdraw = 1000");
		boolean result = account.withdraw(1000);
		if (result) {
			System.out.println("Withdraw successfull");
			System.out.println("Balance = " + account.getBalance());

		} else {
			System.out.println("Withdraw failed");
		}
		
		System.out.println("deposit = 5000");
		result = account.deposit(5000);
		if (result) {
			System.out.println("Deposit successfull");
			System.out.println("Balance = " + account.getBalance());

		} else {
			System.out.println("Deposit failed");
		}

	}

}
