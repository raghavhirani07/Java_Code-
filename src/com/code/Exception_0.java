package com.code;


import java.util.Scanner;

public class Exception_0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int[] a=new int[2];


        System.out.print ("Enter Number 1 = ");
        a[0]=sc.nextInt ();
        System.out.print ("Enter Number 2 = ");
         a[1]=sc.nextInt ();
           //* Here we use multiple catch like if else style
           //* Try is only one
           //* nesting is also done when 1 try in try {try+catch} works
        try {
            double ans = a[0]/a[1]; //* a[0]/a[11] these are  array out of bounds
            System.out.println ("Answer is = "+ans );
        }
        catch (ArithmeticException ae){
            //ae.printStackTrace ();
            System.err.println ("Can not divide by Zero(0) ");
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.err.println ("Check array index ");
        }

        //System.out.println ("Good Bye !!");


    }
}
