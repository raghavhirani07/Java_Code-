package com.code;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_list_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<> ();
        Scanner input = new Scanner (System.in);
        // System.out.println (arr.size ());
        do {
            System.out.print ("enter the number iff exit then enter -1 :");
            arr.add (input.nextInt ());
        } while (arr.get (arr.size () - 1) != -1);
        for (int i = 0; i < arr.size () - 1; i++) {
            for (int j = i + 1; j < arr.size (); j++) {
                if (arr.get (i) > arr.get (j)) {
                    Collections.swap (arr, i, j);

                }

            }

        }
        /*for (int x : arr) {
            System.out.print (x + " ");
        }*/
        System.out.println (arr);
    }
}
