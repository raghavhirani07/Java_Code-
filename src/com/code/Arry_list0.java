package com.code;

import java.util.ArrayList;
import java.util.Collections;

public class Arry_list0 {
    public  static  void swap(ArrayList<Integer> arr ,int  inx1 , int  inx2){
        int temp = arr.get (inx1);
        arr.set (inx1,arr.get (inx2));
        arr.set(inx2,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<> ();
        arr.add (5);
        arr.add (1,10);
        arr.remove (0);
        arr.set (0,5);
        arr.add (6);
        arr.add (7);
        arr.add (8);
        arr.add (9);
        System.out.println (  arr.contains (8));
        System.out.println (arr.get (4));
        System.out.println (arr.size ());
        swap (arr,0,1);
        Collections.sort (arr,Collections.reverseOrder ());
        System.out.println (arr);
    }
}
