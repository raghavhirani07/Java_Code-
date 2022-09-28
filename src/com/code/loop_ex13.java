package com.code;

import java.util.Scanner;

public class loop_ex13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int text = s.nextInt();
        for (int i = 0; i <= text; i++) {
            for (int j = 0; j <= 2 * text; j++) {
                if (j == (text - i - 1) || j == (text + i - 1)) {


                    System.out.print("*");
                } else if (i == text) {
                    System.out.print("*");
                } else
                    System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
}



