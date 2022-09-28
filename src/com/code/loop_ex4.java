package com.code;

import java.util.Scanner;

public class loop_ex4 {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a =s.nextInt();
        int i;
        for(i = 2; i <a; i++) {
            if((a%i)== 0)
            {
                System.out.println("number is non prime");
                break;

            }


        }
        if(i==a)
        {
            System.out.println("number is prime");
        }


    }
}
