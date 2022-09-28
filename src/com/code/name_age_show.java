package com.code;

import java.util.Scanner;


public class name_age_show {
    public static void main(String[] args) {
        Scanner input1=new Scanner(System.in);
        //Scanner input2=new Scanner(System.in);
        System.out.print("Enter your name and age:");
        System.out.println(input1.next()+"! you are "+input1.nextInt()+" years old!");
    }
}
