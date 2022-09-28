package com.code;

import java.util.Arrays;

public class TwoD_arry {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 3;
        numbers[0][1] = 5;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[0][2] = 4;
        numbers[1][2] = 7;
        int[][] arry = {{2, 2}, {4, 5}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print (arry[i][j] + " ");
            }
            System.out.println (" ");
        }
        System.out.println (numbers.length);

    }
}
