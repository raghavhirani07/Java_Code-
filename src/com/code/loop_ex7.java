package com.code;

import java.util.Scanner;

public class loop_ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        int n1=0;
        int n2=1;
        System.out.print("0 1 ");

        int sum;
        for (int i =3; i <=a ; i++) {
            sum=n1+n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;


        }

    }
}
