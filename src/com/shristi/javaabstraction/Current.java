package com.shristi.javaabstraction;

public class Current extends Bank{
    public Current(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if(balance >= amount)
        {
            balance = balance - amount-10;
            System.out.println("Please collect your money");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("");
    }

    @Override
    void deposit(double amount) {

        if(amount!=0) {
            balance = balance + amount ;
            System.out.println("Your Money has been successfully deposited");
            System.out.println("");
        }
        else{
            System.out.println("Enter the valid amount");
        }

    }
}
