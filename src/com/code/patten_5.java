package com.code;

public class patten_5 {
    //? 0/1 Triangle
    public  static  void triangle(int row , int col){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <=i ; j++) {
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print ("0 ");}
                }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        triangle (5,5);
    }
}
