package com.shristi.inheritanceAssignment;

public class Current extends Bank{

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		
			balance = balance - amount -5;
			System.out.println("please collect your money");
		
		

	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		
			balance = amount + balance + 5;
			System.out.println("Your Money has been successfully deposited");
		
		
		

	}
	
	

}
