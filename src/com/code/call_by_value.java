package com.code;

public class call_by_value {
    public static void main(String[] args) {
        int x=1;
        increment(x);
        System.out.println(x);

    }
    public static  void  increment(int x)
    {
        x++;
        System.out.println(x);
    }
}
