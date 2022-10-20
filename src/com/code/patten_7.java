package com.code;

public class patten_7 {
    //? Solid Rhombus
    public static void rhombus(int row) {
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < 2*(row); j++) {
               if(j > row-1-i && j < 2*row-i){
                   System.out.print ("* ");
               }
               else
               {
                   System.out.print("  ");
               }
            }
            System.out.println ();
        }

    }
    public static void main(String[] args) {
        rhombus (5);
    }
}
