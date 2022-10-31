package com.code;

import java.util.ArrayList;

public class Arry_list_ex3 {
    //* Bruth Force Apoorach
    public static  int storewater (ArrayList<Integer> arr ){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size () ; i++) {
            for (int j = i+1; j < arr.size () ; j++) {
                max = Math.max (Math.min(arr.get (i), arr.get (j))*(j-i),max);
            }
        }
        return max;
    }
    //* optimum approach o(n)
    public  static  int storewater1(ArrayList<Integer> arr ){
        int max = 0;
        int left = 0;
        int right = arr.size ()-1;
        while (left < right){
            int hight = Math.min(arr.get (left),arr.get (right));
            int width = right - left;
            max = Math.max (max,hight*width);
            if(arr.get (left)  < arr.get (right)){
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add (1);
        arr.add (8);
        arr.add (6);
        arr.add (2);
        arr.add (5);
        arr.add (4);
        arr.add (8);
        arr.add (3);
        arr.add (7);
        System.out.println (storewater (arr));
        System.out.println (storewater1 (arr));
    }
}
