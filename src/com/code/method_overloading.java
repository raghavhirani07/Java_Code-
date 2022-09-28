package com.code;

public class method_overloading {
    public static  int sum(int x,int y)
    {
        return (x+y);
    }
    public static  int sum(int x,int y,int z)
    {
        return (x+y+z);
    }
    public static  void sayHi()
    {
        System.out.println("Hi");
    }
    public static void sayHi(String name)
    {
        System.out.println("Hi "+name);
    }
    public static void main(String[] args) {
        System.out.println( sum(1,2));
        System.out.println(sum(1,2,3));
        sayHi("raghav");

    }
}
