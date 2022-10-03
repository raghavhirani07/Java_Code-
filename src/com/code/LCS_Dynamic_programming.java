package com.code;

public class LCS_Dynamic_programming {
    public static void main(String[] args) {
        char[] x = {'A','B','C','B','D','A','B'};
        char[] y = {'B','D','C','A','B','A'};
        System.out.println ("Longest Common Subsequence String size is "+LCS(x,y));
    }

    private static int LCS(char[] x, char[] y) {
        int[][] arr=new int[x.length+1][y.length+1];
        for (int i = 1; i <=x.length; i++) {
            for (int j = 1; j <=y.length; j++) {
                if(x[i-1] == y[j-1]) {
                    arr[i][j] = arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
       /* for (int i = 0; i <=x.length ; i++) {
            for (int j = 0; j <=y.length ; j++) {
                System.out.print (arr[i][j]);
            }
            System.out.println ();
        }*/
        return arr[x.length][y.length];

    }
}
