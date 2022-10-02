package com.code;
public class Knapsack_Dynamic_Programming {
    public static void main(String[] args) {
        int w = 11;
        int n=5;
        int[] weight = {1,2,5,6,7};
        int[] value = {1,6,18,22,28};
        int ans = knapsack_dp (n,w, weight, value);
        System.out.println ("Max value " +ans);
    }
    private static int knapsack_dp(int n ,int w, int[] weight, int[] value) {
        int[][] a=new int[n+1][w+1];
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=w ; j++) {
                if (weight[i - 1] > j) {
                    a[i][j] = a[i - 1][j];
                } else {
                    a[i][j] = Math.max (a[i - 1][j - weight[i - 1]] + value[i - 1], a[i - 1][j]);
                }
            }}
        return a[n][w];
    }
}
