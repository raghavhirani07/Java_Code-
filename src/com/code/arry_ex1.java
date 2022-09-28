package com.code;

import java.util.Scanner;

public class arry_ex1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many element : ");
        int n = input.nextInt();
        int[] numbers=new int[n];
        fillArryofIntegers(numbers);

        Arryy_2.printArray(numbers);

    }
    public static void fillArryofIntegers(int[] numbers)
    {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();

        }


    }
}
