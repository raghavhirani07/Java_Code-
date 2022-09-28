package com.code;

import java.util.Arrays;

public class maxsum_subarray {
    public static void main(String[] args) {
        int[] arr={5,-1,-8,4,6,6};
//        for (int v:arr
//             ) {
//            System.out.print(v+" ");
//        }
        int i=0;
        int sum=0;
        int maxsum=0;
        while(i < arr.length){
            sum+=arr[i];
            if(sum < 0){
                sum=0;
            }
            if( sum >= maxsum) {
                maxsum = sum;
            }
            i++;
        }
        System.out.println (maxsum);

    }
}
