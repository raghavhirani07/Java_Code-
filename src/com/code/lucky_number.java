package com.code;

import java.util.Scanner;

public class lucky_number {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your 4 Digit number : ");
        int n= input.nextInt();
        if (!(n >999 && n< 9999))
        {
            System.out.println(n + " is not four digit number");
        }
        else {
            int firstNumber = (n / 1000) % 10;
            int secondNumber = (n / 100) % 10;
            int thirdNumber = (n / 10) % 10;
            int fourthNumber = n % 10;




            if (firstNumber + secondNumber == thirdNumber + fourthNumber) {
                System.out.println("your number is lucky");

            } else {
                System.out.println("your number is not lucky ");
            }
        }

    }
}
