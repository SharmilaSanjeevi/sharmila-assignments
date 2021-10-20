package com.shristi.assignment;

public class Bank {

	double balance = 0;

	Bank(double balance) {

		this.balance = balance;
	}

	public void withdraw(int x) {

	}

	public void deposit(int x) {

		balance = balance + x;
	}

	public double getBalance() {
		
		return balance;
	}

}
