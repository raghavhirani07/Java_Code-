package com.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Arry_list_ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<> ();
        ArrayList<Integer> ans = new ArrayList<> ();
        Scanner input = new Scanner (System.in);
        n.add (1);
        n.add (1);
        n.add (1);
        n.add (1);
        n.add (1);
        n.add (1);
        n.add (2);
        n.add (3);
        n.add (4);
        n.add (3);

        for (int i = 0; i < n.size (); i++) {
            if (n.contains (n.get (i))) {
                ans.add (n.get (i));
            }


        }
        System.out.println (ans);
    }
}
