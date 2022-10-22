package com.code;
//? Time complexity is 0(n^2)

public class max_subarray_sum_1 {
    public  static  void  maxsum(int[] arr){
        int prefix[]= new int[arr.length];
        int maxsum=Integer.MIN_VALUE;
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length ; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
                //  System.out.println (Arrays.toString (prefix));
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                int currensum = i==0 ? prefix[i] :  prefix[j]-prefix[i-1];
                if(currensum >= maxsum){
                maxsum=currensum;
                }
            }
        }
        System.out.println (maxsum);
    }


    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsum (arr);
    }
}
