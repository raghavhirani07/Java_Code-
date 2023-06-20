package com.code;

//* Push the element in Bottom Part



import java.util.Iterator;
import java.util.Stack;

public class Stack_problem_02 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer> ();
        stack.push (1);
        stack.push (2);
        stack.push ( 3);

        pushAtBottom (stack, 0);
            // PrintStack (stack);
        System.out.println (reverseString("abc"));
        reverseStack(stack);
        PrintStack (stack);
    }

    private static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty ()){
            return;
        }

        int top = stack.pop ();
        reverseStack (stack);
        pushAtBottom (stack, top);
    }
    public static void  PrintStack(Stack<Integer> stack){
            Iterator<Integer> it = stack.iterator ();
            while (it.hasNext ()){
                System.out.println (it.next ());
            }
    }

    private static String reverseString(String str) {
        Stack<Character> s = new Stack<> ();
        int inx = 0;
        while(inx < str.length ()){
            s.push (str.charAt (inx));
            inx++;
        }

        StringBuilder result = new StringBuilder ("");
        while(!s.isEmpty ()){
            char curr = s.pop ();
            result.append (curr);

        }
        return result.toString ();
    }

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty ()){
            stack.push (data);
            return;
        }
        int top = stack.pop ();

        pushAtBottom (stack,data);
        stack.push (top);
    }
}
