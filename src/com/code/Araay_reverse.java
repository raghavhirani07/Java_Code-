package com.code;

import java.util.Arrays;

public class Araay_reverse {
    public static int[] reverse_array(int[] arr,int start,int end){
        while(start < end ) {
           int temp=arr[start];
           arr[start]=arr[end] ;
            arr[end]=temp;
            start++;
            end--;

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={1,56,9,-8,4,5,-10,0,1,2,2,10};
        System.out.println (Arrays.toString (arr));
        System.out.println (Arrays.toString (reverse_array(arr,0,arr.length-1)));
    }
}
