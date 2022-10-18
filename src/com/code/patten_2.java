package com.code;
//? Half pyramid

public class patten_2 {
    public  static  void pyramid(int col, int row){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if( j < col-1-i){
                    System.out.print ("  ");
                }
                else {
                    System.out.print ("* ");
                }
            }
            System.out.println ();
        }
    }
    public static void main(String[] args) {
        pyramid (4,4);
    }
}
