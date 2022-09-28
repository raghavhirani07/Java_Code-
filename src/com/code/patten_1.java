package com.code;

public class patten_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                if(j < 5 - i && j >= i   ) {
                    System.out.print ("*");
                }
                else
                {
                    System.out.print (" ");
                }
            }
            System.out.println("");
        }
        for (int i = 5 ; i > 2 ; i--) {
            for (int j = 0; j < 5 ; j++) {
                if(j > 5 - i  && j < i -1   ) {
                    System.out.print ("*");
                }
                else
                {
                    System.out.print (" ");
                }
            }
            System.out.println("");
        }
    }
}
