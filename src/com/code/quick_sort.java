package com.code;

import java.util.Arrays;
import java.util.Scanner;

public class quick_sort {
    public static void main(String[] args) {
        System.out.println ("Enrollment no. = 200130107068");
        System.out.println ("Name = Hirani Raghav");
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter the length of array : ");
        int length = input.nextInt ();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt ();
        }
        quick (array, 0, length -1 );
        System.out.println (Arrays.toString (array));
    }

    public static void quick(int[] array, int low, int high) {
        if(low < high) {
            int pivot_index = partion (array, low, high);
            quick (array, low, pivot_index - 1);
            quick (array, pivot_index+1,high);
        }
    }
    public static int partion(int[] array, int low, int high) {
    int pivot = array[high];
    int i =low-1;
        for (int j = low; j < high ; j++) {
            if(array[j] < pivot){
                i++;
                int temp=array[j];
                array[j]=array[i];
                array[i]=temp;

            }
        }
        i++;
        int temp=array[i];
        array[i]=array[high];
        array[high]=temp;
        return i;
    }
}
