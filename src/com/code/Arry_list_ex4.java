package com.code;
//? Sum of pair is equal to Target Here Given array is already shorted

import java.util.ArrayList;
import java.util.Arrays;

public class Arry_list_ex4 {
    //? Broth Force Approach Compare Every pair
    public static boolean sumpair_0(ArrayList<Integer> arr,int target){
        for (int i = 0; i < arr.size ()-1; i++) {
            for (int j = i+1; j < arr.size ()-1 ; j++) {
                if(arr.get (i) +arr.get (j) == target ){
                    return true;
                }
            }
        }
        return false;
    }

    //? Linear Approach With 2 Pointer 0(n)

    public static boolean sumpair_1(ArrayList<Integer> arr , int target){
        int left = 0;
        int right = arr.size ()-1;
        while(left < right) {
            if (arr.get (left) + arr.get (right) == target) {
                return true;
            }
            if (arr.get (left) + arr.get (right) > target) {
                right--;
            }
            if (arr.get (left) + arr.get (right) < target) {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<> (Arrays.asList (1,2,3,4,5,6));
        System.out.println (sumpair_0 (arr,7));
        System.out.println (sumpair_1 (arr,10));
    }
}
