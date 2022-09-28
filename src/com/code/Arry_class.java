package com.code;

import java.util.*;

public class Arry_class{
    public static void main(String[] args) {
        int[] numbers={5,3,2,1,4,5,8,7,-1,-2};
         Arrays.sort(numbers);
     Array_basic_2.printArray(numbers);
      System.out.println(" ");
//         numbers= new int[]{2, 5, 6, 4, 1, 8, 9, 1, 2, 5};
//         Arrays.sort(numbers,3,6);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]+" ");
//
//        }
       int a=Arrays.binarySearch(numbers,5);
        System.out.println(a+" index is key");
   a=Arrays.binarySearch(numbers,10);
        System.out.println(a+" index is key");

    }
}
