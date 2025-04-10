package com.mindgate.main.domain;

import javax.print.attribute.standard.Sides;

public class Savings extends Account {
	private final int MINIMUM_BALANCE = 500;
	private boolean isSalary;

	public Savings() {
		System.out.println("Savings Default Constructor");
	}

	public Savings(long accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
		System.out.println("Savings Parameterized Constructor");
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public boolean withdraw(double amount) {
		if (isSalary && amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (isSalary == false && amount > 0 
								&& getBalance() - amount >= MINIMUM_BALANCE) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		return super.deposit(amount);
	}
}
