package com.code;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack_Greedy_apporach {
    public static void main(String[] args) {
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
       /* for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print (arr[i][j]+ " ");
            }
            System.out.println ();
        }*/
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
        System.out.println (final_val);
    }
}
