package com.code;

public class array_subarray {
    public static void main(String[] args) {
        int[] num={1,-4,44,7,8,8};
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print (num[k]+ " x");
                }
                System.out.println (" ");
            }
        }
    }
}
