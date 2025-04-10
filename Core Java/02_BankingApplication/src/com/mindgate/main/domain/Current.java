package com.mindgate.main.domain;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
		System.out.println("Current Default Constructor");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
		System.out.println("Current Parameterized Constructor");
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && amount > getBalance() && amount <= getBalance() + overdraftBalance) {
			amount = amount - getBalance();
			setBalance(0);
			overdraftBalance = overdraftBalance - amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0 && initialOverdraftBalance > overdraftBalance) {
			if (amount <= (initialOverdraftBalance - overdraftBalance)) {
				overdraftBalance += amount;
				return true;
			} else {
				amount = amount - (initialOverdraftBalance - overdraftBalance);
				overdraftBalance = initialOverdraftBalance;
				setBalance(getBalance() + amount);
				return true;
			} 
		} else {
			if (amount > 0) {
				setBalance(getBalance() + amount);
				return true;
			}
			return false;
		}

	}

}
