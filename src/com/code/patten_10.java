package com.code;

public class patten_10 {
    //? ******
    //? **  **
    //? *    *

    public static void main(String[] args) {
        patten10(5);
    }

    public static void patten10(int row) {
        for (int i = 0; i < row ; i++) {
            //* First line
            if( i ==0 ){
                for (int j = 0; j < (row*2)-1; j++) {
                    System.out.print ("* ");
                }
                System.out.println ();
            }
            //* Star
            for (int j = 1; j < (row-i); j++) {
                System.out.print ("* ");
            }

            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print ("  ");
            }
            for (int j = i+1; j < row; j++) {
                System.out.print ("* ");
            }
            System.out.println ();
        }
    }
}
