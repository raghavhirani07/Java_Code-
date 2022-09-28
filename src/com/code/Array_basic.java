package com.code;

import java.util.Arrays;

public class Array_basic {
    public static void main(String[] args) {
    int[] number =new int[5];
    int array[]=new int[5];
    number[0]=5;
    number[1]=10;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println (Arrays.deepToString (new int[][]{number}));
    }


}
