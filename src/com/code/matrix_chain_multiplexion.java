package com.code;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class matrix_chain_multiplexion {
    public  static int matrix_mul(int n, Integer arr[] ){
     int[][] dp = new  int[n][n];
        for (int i = 2; i < n ; i++) {
            int col = i;
            for (int j = 0; j < n-i; j++,col++) {
                dp[j][i]= Integer.MIN_VALUE;
                for (int k = j+1; k < i; k++) {
                    dp[j][i]=Math.max (dp[j][col],dp[j][k]+dp[k][col]+arr[j]*arr[k]*arr[col]);
                }
            }
        }
     return dp[0][n-1];
    }
    public static void main(String[] args) {
        System.out.println ("Enrollment no. = 200130107068");
        System.out.println ("Name = Hirani Raghav");
        Integer arr[] = {10,20,30,40,50};
        System.out.println ("Matrix chain : "+ Arrays.toString (arr));
        System.out.println ("Minimum multiplication : " +matrix_mul (arr.length,arr));
    }

}
