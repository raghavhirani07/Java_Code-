package com.code;

import java.util.Scanner;

public class loop_ex8 {
    public static void main(String[] args) {
        String text;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your string: ");
        text=s.nextLine();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i)+" ");

        }

    }
}
