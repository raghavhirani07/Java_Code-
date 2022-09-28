package com.code;

import java.util.Scanner;

public class loop_ex11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int text=s.nextInt();
        for (int i = 1; i <=text; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);

            }
            System.out.println(" ");

        }

    }
}
