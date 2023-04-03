package com.code;

public class bitwise {
    public static void main(String[] args) {
        System.out.println ((5 & 6));
        System.out.println ((5 | 6));
        System.out.println ((5 ^ 0)); // any operation with 0 is x
        System.out.println ((5 ^ 5));   // x xor with x is always = 0
        System.out.println ((~6));
        System.out.println ((~0));
    }
}
