package com.code;
//?   Hollw rectangle
public class patten_0 {
    public  static  void  hollow_rectangle(int col,int row){
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                if(i == 0 || j ==0 || i== row-1 || j == col-1){
                    System.out.print ("* ");
                }
                else {
                    System.out.print ("  ");
                }
            }
            System.out.println ();

        }
    }
    public static void main(String[] args) {
        hollow_rectangle (4,3);
    }
}
