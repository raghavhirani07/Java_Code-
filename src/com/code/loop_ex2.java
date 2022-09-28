package com.code;

import java.util.Scanner;

// when sum of enter number is grether than 100 than print done and breck progame
public class loop_ex2 {
    public static void main(String[] args) {
       Scanner s =new Scanner(System.in);
       int sum=0;
        do {
            System.out.print("Enter the number: ");
            sum += s.nextInt();

        } while (sum <= 100);
        System.out.print("Done your sum is"+sum);
    }
}
