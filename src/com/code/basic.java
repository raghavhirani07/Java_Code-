package com.code;

import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        String arg1 = args[0];  // in configuration type hello then show here
        System.out.println(arg1);
        int a = 10;
        System.out.println(a);
        String myName = "Raghav";
        System.out.println(myName);
        String myNameCopy = myName;
        System.out.println("copy name " + myNameCopy);
        myName = "kashyap";
        System.out.println(myName);
        final String myCompuney = "ISRO";
        System.out.println(myCompuney);
        byte b1 = 5; //-128 to 127
        short s1 =20;
        int i1 =100;
        long l1 = 9999;
        System.out.println(Integer.MAX_VALUE);
        char c1='A';
        char c2=65;
        char c3='\u0041';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        int code1='A';
        int code2='\u0041';
        System.out.println(code1);
        System.out.println(code2);
        // boolean data type
        boolean c=true;



    }
}
