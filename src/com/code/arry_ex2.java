package com.code;

public class arry_ex2 {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        arry_ex1.fillArryofIntegers(numbers);
        int sum=0;
        int product=1;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
            product*=numbers[i];
        }
        System.out.println("sum is "+sum);
        System.out.println("product is "+product);
        System.out.println("average "+ sum/5);
    }
}
