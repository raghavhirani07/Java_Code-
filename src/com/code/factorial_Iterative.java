package com.code;
import java.util.Scanner;
public class factorial_Iterative {
    public  static  int factorial(int num){
        if( num == 0){
            return 1;
        }
        else if ( num > 0) {
            int ans = 1;
            for (int i = 1; i <= num; i++) {
                ans *= i;
            }return ans;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.print ("Enter the number  :");
        int num = n.nextInt ();
        int ans =factorial (num);
        System.out.println (ans != -1 ? "The factorial of "+ num +" is : "+ans: "Negative number factorial is not posible");
    }
}
