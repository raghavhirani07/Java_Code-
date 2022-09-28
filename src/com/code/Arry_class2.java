package com.code;

import java.util.Arrays;

public class Arry_class2 {
    public static  int sum(int... number){
        int sum=0;
        for (int i = 0; i < number.length;i++) {
            sum+=number[i];


        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers1={5,4,5,8,89,7,88,9};
        int[] numbers2={5,4,5,8,89,7,88,9};
        System.out.println(numbers1 == numbers2);
        System.out.println(Arrays.equals(numbers2,numbers1));
        int[] numbers3=new int[4];
        Arrays.fill(numbers3,4);
        System.out.println(Arrays.toString(numbers3));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,-1));

    }
}
