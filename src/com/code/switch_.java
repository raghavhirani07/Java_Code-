package com.code;

import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        System.out.print("Enter your number :");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        switch (n) {
            case 10 -> System.out.println("10");
            case 90 -> System.out.println("90");
            case 2 -> System.out.println("2");
            case 5 -> System.out.println("5");
            default -> System.out.println("none about this");
        }

    }
}
