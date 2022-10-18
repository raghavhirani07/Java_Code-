package com.code;

public class patten_4 {
    //? FLOYD's Tringle
    public  static  void  tringle(int row,int col){
        int temp=0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print (++temp+"  ");
            }
            System.out.println ();
        }

    }
    public static void main(String[] args) {
        tringle (5,5);
    }
}
