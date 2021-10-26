package com.shristi.inheritanceAssignment;

public class Savings extends Bank{

	

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		
		
			
			balance = balance - amount;
			System.out.println("please collect your money");
	
		
	
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
	
			balance = balance + amount;
			System.out.println("Your Money has been successfully deposited");
		
		}
		
	}


