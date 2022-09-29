package com.code;

import java.util.Scanner;

public class factorial_recursive {
    public  static  int factorial(int num){
         if(num < 0){
             return -1;
         }else if ( num ==0 || num == 1){
             return 1;
         }
         else{
             return num*factorial (num-1);
         }
    }
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.print ("Enter the number  :");
        int num = n.nextInt ();
        int ans =factorial (num);
        System.out.println (ans != -1 ? "The factorial of "+ num +" is : "+ans: "Negative number factorial is not possible " );

    }
}
