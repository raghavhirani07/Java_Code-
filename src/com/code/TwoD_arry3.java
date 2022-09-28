package com.code;

public class TwoD_arry3 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7,5,5},
        };
        int sum=0;
        int sum1=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum+=a[i][j];
                sum1+=a[j][i];

            }
            System.out.println("sum of row "+i+" is "+sum);
            System.out.println("sum of row "+i+" is "+sum);
        }

    }
}