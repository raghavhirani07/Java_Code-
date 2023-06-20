package com.code;

import java.util.Arrays;
import java.util.Stack;

//* stock problem
public class Stack_problem_03 {
    public static void main(String[] args) {

        int[] stock = { 100,80,60,70,60,85,100};
        System.out.println (Arrays.toString (calculate_span(stock)));
    }

    private static int[] calculate_span(int[] stock) {
        int[] ans = new int[stock.length] ;
        Stack<Integer> stack = new Stack<> ();
        stack.push (0);
        ans[0] = 1 ;
        for (int i = 1; i < stock.length; i++) {
          int tempstock = stock[i];
          while (!stack.isEmpty () && tempstock >= stack.peek () ){
              stack.pop ();
          }

        }
        return  ans;
    }
}
