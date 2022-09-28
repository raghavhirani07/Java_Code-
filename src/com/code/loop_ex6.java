package com.code;
import java.util.Scanner;

public class loop_ex6 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number :");
        int a = s.nextInt();
        int sum=0;

        while(a!=0)
        {
           sum+=(a%10);
           a=a/10;

        }
        System.out.println("sum="+sum);
    }
}
