package com.code;

import java.util.Scanner;

public class switch_practicle {
    public static void main(String[] args) {
        System.out.print("Enter a number like this (1 + 2 ): ");
        Scanner input=new Scanner(System.in);
        double d1=input.nextDouble();
        char c1=input.next().charAt(0);
        double d2=input.nextDouble();
        switch (c1){
                case '+' -> System.out.println(d1+d2);
                case '-' -> System.out.println(d1-d2);
                case '/' -> System.out.println(d1/d2);
                case '*' -> System.out.println(d1*d2);
                default -> System.out.println("unveiled statement ");

        }

    }
}
