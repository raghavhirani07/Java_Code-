package com.code;

import java.util.Scanner;

public class loop_ex14 {
    public static void main(String[] args) {
        Scanner s =new Scanner( System.in);
        System.out.print("Enter the number : ");
        int text=s.nextInt();
        for (int i = 0; i < text; i++) {
            for (int j = 0; j < text; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
