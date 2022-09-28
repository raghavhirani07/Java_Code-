package com.code;

import java.util.Scanner;

public class linear_search {
    public  static boolean linear(int[] array,int high,int key){
        for (int i = 0; i < high; i++) {
            if(array[i] == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner  input = new Scanner (System.in);
        System.out.print ("Enter the length of array : ");
        int length = input.nextInt ();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt ();
        }
        System.out.print ("Enter the Key : ");
        int key =input.nextInt ();
        System.out.println (linear (array,length,key) ? "Key Found in array" : "Key not Found in array");
    }
}
