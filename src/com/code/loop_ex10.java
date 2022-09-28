package com.code;



import java.util.Scanner;

import static com.code.loop_ex9.*;

public class loop_ex10 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the your string: ");
        String text=s.nextLine();
        String reverse=reverse(text);
        if(text.equals(reverse))
        {
            System.out.println("string is palindrome");
        }
        else
        {
            System.out.println("string is not palindrome");
        }
    }
}
