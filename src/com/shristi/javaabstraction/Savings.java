package com.shristi.javaabstraction;

public class Savings extends Bank{


    public Savings(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {

        if(super.balance >= amount){

            super.balance = super.balance - amount - 3;
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
        System.out.println("IN savings");
        System.out.println(super.balance);

        super.balance = super.balance + amount +100;

    }
}
