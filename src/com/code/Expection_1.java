package com.code;

import java.util.Scanner;

public class Expection_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int balance = 5000;
        System.out.println ("Enter the amount: ");
        int w = sc.nextInt ();

        try {
            if (balance - w < 0) {
                throw new Exception ("Your debit value is greeter than your bank balance ");
            }
            balance -= w;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        //* Error come or not come but finally run always!!
        //* in this code we don't put in try or catch because some time there not run
        //* The advantage of the finally key word is to clean up and release resources.

        finally {
            sc.close ();
        }


        System.out.println ("Update the balance" + balance);

    }
}
