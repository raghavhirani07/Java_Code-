package com.code;
import java.util.Arrays;
import java.util.Scanner;
public class bubble_sort {
    public  static int[] bubble_sort(int[] array,int length){
       int i=0;
        while (i < length){
            for (int j = 0; j <length -1 ; j++) {
                if(array[j] > array [j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            i++;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter the length of array : ");
        int length = input.nextInt ();
        int[] array =new int[length];
        for (int i = 0; i <length ; i++) {
            array[i]=input.nextInt ();
        }
        System.out.println ("With out sorting" + Arrays.toString (array));
        System.out.println ("Sorting Array "+ Arrays.toString (bubble_sort (array,length)));
    }
}
