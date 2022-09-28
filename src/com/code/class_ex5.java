package com.code;

import java.util.Date;

class Transaction {
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date=new Date ();
    }


}

public class class_ex5 {
    public static void main(String[] args) {

    }
}
