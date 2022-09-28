package com.code;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = number.nextInt();
        if (n%2 == 1)
        {
            System.out.println(n+" is odd number");
        }
        else
        {
            System.out.println(n+" is even number ");
        }
    }
}
