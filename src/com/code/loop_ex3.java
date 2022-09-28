package com.code;

public class loop_ex3 {
    public static void main(String[] args) {
        int a=7;
        for (int i = 1; i <= a/2; i++) {
            if((a % i) == 0)
            {
                System.out.print(i+" ");
            }

        }
    }

}
