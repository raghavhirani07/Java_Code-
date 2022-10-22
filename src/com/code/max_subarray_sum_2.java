package com.code;
//? Time Complexity 0(n)
//? Also knows as kadanes Algorithm
public class max_subarray_sum_2 {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        kadanes(arr);
    }

    public static void kadanes(int[] arr) {
        int maxsum=Integer.MIN_VALUE;
        int currensum=0;
        for (int i = 0; i < arr.length; i++) {
            currensum = currensum + arr[i];
            if(currensum < 0){
                currensum = 0;
            }
            maxsum =Math.max (currensum,maxsum);
        }
        System.out.println (maxsum);
    }
}
