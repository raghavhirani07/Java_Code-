package com.code;

import javax.swing.*;
import java.util.Scanner;


public class loop_ex9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the your string: ");
        String text=s.nextLine();
        text=reverse(text);
        System.out.println("Reverse string is: "+text );

    }

    public static String reverse(String text) {
        StringBuilder temp = new StringBuilder();
        for (int i = text.length()-1; i >=0 ; i--) {
            temp.append(text.charAt(i));

        }
        return temp.toString();

    }
}
