package com.code;

import java.util.Scanner;

public class prime_between_two_number {
    public static boolean prime(int n)
    {
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;

            }


        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input1=new Scanner(System.in);
        int x=input1.nextInt();
        int y=input1.nextInt();
        for (int i = x; i <= y; i++) {
           boolean a= prime(i);
           if(a)
           {
               System.out.print(i+" ");
           }


        }

    }
}
