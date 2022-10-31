package com.code;
//? Multi-Dimensional Array List

import java.util.ArrayList;

public class Arraylist_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<> ();
        ArrayList<Integer> list = new ArrayList<> ();
        ArrayList<Integer> list1 = new ArrayList<> ();
        list.add (2);
        list.add (3);
        list.add (4);
        list1.add (5);
        list1.add (6);
        list1.add (7);
        arr.add (list);
        arr.add (list1);
        System.out.println (arr);
    }

}
