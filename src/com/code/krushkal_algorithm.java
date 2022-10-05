package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class krushkal_algorithm {
    public static void main(String[] args) {
        int[][] graph_weight = {{1,1,1,0},{0,0,0,1},{0,0,0,1},{0,0,0,0}};
        char[] vertex = {'A','B','C','D','E'};
        int[][] arr = new  int[10][3];
        int count = 0;
        for (int i = 0; i < graph_weight.length ; i++) {
            for (int j = 0; j < graph_weight.length; j++) {
                if (graph_weight[i][j] != 0) {
                    arr[count][0] = (int) vertex[i];
                    arr[count][1] = (int) vertex[j];
                    arr[count][2] = graph_weight[i][j];
                    count++;
                }
            }
        }

    }
}
