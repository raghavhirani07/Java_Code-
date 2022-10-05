package com.code;

import java.util.Arrays;
import java.util.Comparator;

public class krushkal_algorithm {
    public static void main(String[] args) {
        int[][] graph_weight = {{0,7,8,5,0},{7,0,0,10,6},{8,0,0,9,0},{5,10,9,3,15},{0,6,0,15,0}};
        char[] vertex = {'A','B','C','D','E'};
        int l = 20 ;
        int[][] arr = new  int[l][3];
         int count = 0;
        for (int i = 0; i < graph_weight.length ; i++) {
            for (int j = i + 1; j < graph_weight.length; j++) {
                if (graph_weight[i][j] != 0) {
                    arr[count][0] = (int) vertex[i];
                    arr[count][1] = (int) vertex[j];
                    arr[count][2] = graph_weight[i][j];
                    count++;
                }
            }
        }
        Arrays.sort (arr, (int[] o1 , int[] o2) -> o2[2] - o1[2]);
        for (int i = 0; i < count ; i++) {
            System.out.print ("Edge {"+ (char)arr[i][0]+","+(char)arr[i][1]+"} = w { "+ arr[i][2]+" }");
            System.out.println ();
        }
        // Sorting array to it's weight
    }
}
