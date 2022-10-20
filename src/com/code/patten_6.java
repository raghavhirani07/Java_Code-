package com.code;

public class patten_6 {
    //? Butterfly Problem
    public static void main(String[] args) {
        butterfly(4);
    }
    public static void butterfly(int row) {
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < 2*row ; j++) {
                if(j<=i || j>=2*row-1-i){
                    System.out.print ("* ");
                }
                else {
                    System.out.print ("  ");
                }
            }
            System.out.println ();
        }
        for (int i = row-1; i >=0 ; i--) {
            for (int j = 0; j < 2*row ; j++) {
                if(j<=i || j>=2*row-1-i){
                    System.out.print ("* ");
                }
                else {
                    System.out.print ("  ");
                }
            }
            System.out.println ();
        }
    }
}
