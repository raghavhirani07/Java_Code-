package com.code;

public class TwoD_arry4 {
    public static void main(String[] args) {

                int[][] a = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7,5,5},
                };

                int max=Integer.MIN_VALUE;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (max<=a[i][j])
                        {
                            max=a[i][j];
                        }

                    }
                    System.out.println("max of row "+(i+1)+" is "+max);
                    max=Integer.MIN_VALUE;

                }

            }
        }


