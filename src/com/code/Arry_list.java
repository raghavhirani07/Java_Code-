package com.code;

import java.util.ArrayList;

import java.util.*;
import java.util.List;

public class Arry_list {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<> ();
        // in an ArrayList , we can store object like String Integer Boolean Double Character not a primitive type int boolean double char
        numbers.add (2);
        numbers.add (4);
        numbers.add (5);
        numbers.add (3, 1);
        System.out.println (numbers);
        System.out.println (numbers.get (2));
        numbers.set (0, 10);
        System.out.println (numbers);
        numbers.remove (1);
        System.out.println (numbers);
        numbers.remove (Integer.valueOf (10));
        System.out.println (numbers);
        numbers.removeAll (List.of (5));
        System.out.println (numbers);
        System.out.println (numbers.size ());
        numbers.clear ();
        System.out.println (numbers.size ());
        numbers.add (3);
        numbers.add (4);
        numbers.add (-1);
        Collections.sort (numbers);
        System.out.println (numbers);


    }
}
