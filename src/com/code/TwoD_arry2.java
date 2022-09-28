package com.code;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_arry2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row=s.nextInt();
        System.out.print("Enter the coloum : ");
        int colum=s.nextInt();
        int[][] number =getArry(row,colum);
        System.out.println(Arrays.deepToString(number));

    }

    public static int[][] getArry(int row,int colum) {

        Scanner s=new Scanner(System.in);
        int[][] temp= new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                temp[i][j]=s.nextInt();

            }

        }
        return temp;

    }
}
