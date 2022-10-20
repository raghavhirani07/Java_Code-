package com.code;

public class patten_9 {
    //? Diamond patten
    public static void main(String[] args) {
        diamond(4);
    }

    public static void diamond(int row) {
        for (int i = 0; i < row ; i++) {
            //* For space
            for (int j = 0; j < (row-1-i); j++) {
                System.out.print ("  ");
            }
            //* For star
            for (int j = 0; j <(2*i)+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println ();
        }
        for (int i = row-1 ; i >=0 ; i--) {
            //* For space
            for (int j = 0; j < (row-1-i); j++) {
                System.out.print ("  ");
            }
            //* For star
            for (int j = 0; j <(2*i)+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println ();
        }

    }
}
