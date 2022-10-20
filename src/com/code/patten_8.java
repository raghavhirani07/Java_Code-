package com.code;

public class patten_8 {
    //? Hollow Rhombus
    public static void hollow_rhombus(int row) {
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < 2*(row); j++) {
                if(j > row-1-i && j < 2*row-i){
                    if(i ==0 || i==row-1 || j==row-i || j== 2*row-i-1) {
                        System.out.print ("* ");
                    }
                    else {
                        System.out.print ("  ");
                    }
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
    hollow_rhombus (5);
    }
}
