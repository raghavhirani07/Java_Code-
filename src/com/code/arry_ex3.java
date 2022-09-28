package com.code;

import java.util.Scanner;

public class arry_ex3 {
    public static void main(String[] args) {
        int[] number=new int[6];
        arry_ex1.fillArryofIntegers(number);


        int key=0;
        Scanner input =new Scanner(System.in);
        while(key >= 0)
        {
            System.out.print("Enter the key : ");
            key=input.nextInt();
           int a= serchelement(key,number) ;
            System.out.println(key+" occurs "+a+" times");

        }

    }

    public static int serchelement(int key,int[] number) {
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]== key) {
                sum++;
            }
        }
        return sum;

    }
}
