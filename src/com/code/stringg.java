package com.code;

import java.util.Scanner;

public class stringg {
    public static void main(String[] args) {
// string and his method
        String text = "This is some text";

        System.out.println( text.toUpperCase());
        System.out.println(text.length());
        System.out.println(text.isEmpty());
        System.out.println(text.charAt(6));
        System.out.println(text.indexOf('i')); // when charter does not exit return -1
        System.out.println(text.lastIndexOf('i'));
        System.out.println(text.concat(" and add some more"));

        // concatenation string

        String part1="Raghav";
        String part2="Hirani";
        System.out.println(part1 + part2);
        System.out.println(part1 + " "+ part2);
        System.out.println("my favorite number is "+ 5 );
        System.out.println("my favorite number is "+ 5 + 3);
    }
}
