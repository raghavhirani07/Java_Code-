package com.code;

public class patten_3 {
    //? Inverted half pyramid With Numbers
    public static void pyramid_with_numbers(int col,int row){
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j <col-i; j++) {
                System.out.print (j+1);
            }
            System.out.println ();
        }
    }
    public static void main(String[] args) {
        pyramid_with_numbers (5,5);
    }
}
