package com.code;

import java.util.Arrays;

public class arry_ex5 {
    public static void main(String[] args) {
        int[] number = {1, 2, 4, 5, 7, 9, -2, 3};
        int[] temp = new int[number.length];
        int k = number.length;
        int j = 0;
        for (int i = 0; i < number.length; i++) {
            if ((number[i] % 2) == 0) {
                temp[k - 1] = number[i];
                k--;


            } else if ((number[i] % 2) == 1) {
                temp[j] = number[i];
                j++;
            }

        }
        System.out.println (Arrays.toString (temp));

    }
}
