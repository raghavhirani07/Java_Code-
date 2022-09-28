package com.code;

import java.util.Scanner;

public class while_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = input.nextInt();
        while(n < 1 || n > 10)
        {
            System.out.print(n + " is not between 1 and 10 . Try again: ");
            n= input.nextInt();
        }
        System.out.println(n+" is between 1 and 10");
    }
}
