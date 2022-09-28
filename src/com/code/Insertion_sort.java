package com.code;
import java.util.Arrays;
import java.util.Scanner;
public class Insertion_sort {
   public static int[]  insertion_sort(int[] array , int length)
   {
        for (int i = 1; i < length; i++) {
            int current = array[i];
            int j = i-1;
            while (j>=0 && array[j] > current  ) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter the length of array : ");
        int length = input.nextInt ();
        int[] array =new int[length];
        for (int i = 0; i < length ; i++) {
            array[i]=input.nextInt ();
        }
        System.out.println ("With out sorting" + Arrays.toString (array));
        System.out.println ("Sorting Array "+ Arrays.toString (insertion_sort (array,length)));
    }
}
