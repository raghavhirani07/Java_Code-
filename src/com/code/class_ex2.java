package com.code;

import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date ();
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        String s = this.id + " " + this.balance + " " + this.annualInterestRate + "\n";
        return s;

    }
}
    public class class_ex2 {
        public static void main(String[] args) {
            Account testAccount = new Account (1122, 20000, 4.5);
            System.out.println ("withdraw is " + testAccount.withdraw (2500));
            testAccount.deposit (3000);
            System.out.println ("id =" + testAccount.getId () + " balance= " + testAccount.getBalance () + " annualInterest " + testAccount.getAnnualInterestRate () + " Date " + testAccount.getDateCreated ().toString ());

        }


    }
