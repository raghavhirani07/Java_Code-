package com.code;
//? Time complexity is O(n^3)
public class max_subarray_sum_0 {
    public static  void max_sum(int[] arr){
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                int currentsum=0;
                for (int k = start; k <=end ; k++) {
                    currentsum+=arr[k];
                }
                if(currentsum >= maxsum){
                    maxsum=currentsum;
                }
            }
        }
        System.out.println (maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        max_sum (arr);
    }
}
