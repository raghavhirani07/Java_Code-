package com.code;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack_Greedy_apporach {
    public static void main(String[] args) {
        System.out.println ("Enrollment no. = 200130107068");
        System.out.println ("Name = Hirani Raghav");
        int W = 50;
        int[] value={60,100,120};
        int[] weight={10,20,30};
        double[][] arr=new double[value.length][3];
        for (int i = 0; i < value.length ; i++) {
                arr[i][0]=weight[i];
                arr[i][1]=value[i];
                arr[i][2]=value[i]/(float)weight[i];
        }
        Arrays.sort (arr, Comparator.comparingDouble (o -> o[2]));
        int current_capacity=W;
        double final_val=0;
        for (int i = arr.length-1; i>=0; i--) {
            if(current_capacity >= (int)arr[i][1]){
                final_val+=arr[i][0];
                current_capacity-=(int)arr[i][2];
            }
            else{
                final_val+=arr[i][0]*(current_capacity / (float)arr[i][1]);
                break;
            }
        }
        System.out.println ("Weight  : "+ Arrays.toString (weight));
        System.out.println ("Value   : "+ Arrays.toString (value));
        System.out.println (final_val);
    }
}
