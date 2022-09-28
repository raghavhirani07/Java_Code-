package com.code;

import java.util.Scanner;

public class arry_ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.print ("Enter the numbers: ");
        int n = input.nextInt ();
        int[] numbers = new int[n];
        System.out.print ("Enter the array element: ");
        arry_ex1.fillArryofIntegers (numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];

            } else if (numbers[i] <= min) {
                min = numbers[i];
            }


        }
        System.out.println ("the minimum element is " + min + " the maximum element is " + max);

    }


}
