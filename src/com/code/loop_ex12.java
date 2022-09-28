package com.code;

import java.util.Scanner;

public class loop_ex12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int text=s.nextInt();
        for (int i = 0; i <text; i++) {
            for (int j = 0; j <text; j++) {
              if (j > (text-i-2))
              {
                  System.out.print("*");
              }
                  else
              {
                  System.out.print(" ");
              }

            }
            System.out.println(" ");

        }

    }
}
