package com.code;

public class Bitwise_Operation_Xor {
    public static void main(String[] args) {
        // Bitwise Operation Xor that indicated using ^  =x^y
        //        if two bit same then answer is 0
        //   x ^ x = 0 , x ^ 0 = x
        int[] arr1 = {5,4,1,4,3,5,1};  //one no repeat element
        int[] arr2 = {5,4,1,4,3,5,1,2}; // two no repeat element

        System.out.println (onerepet(arr1));
        System.out.println (tworepet(arr2));
    }

    private static int tworepet(int[] arr2) {
        int sum=0;
        for (int ans : arr2) {

        }
        return sum;
    }

    private static int onerepet(int[] arr1) {
        int sum=0;
        for (int ans: arr1) {
            sum ^= ans;
        }
        return  sum;
    }
}
