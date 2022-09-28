package com.code;
import java.util.Arrays;
import java.util.Scanner;
public class Selection_sort {
    public  static int[] selection_sort(int[] array,int length){
        for (int i = 0; i <length-1; i++) {
            for (int j = i; j < length; j++) {
                if(array[j] < array[i]){
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
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
        System.out.println ("With out sorting" +Arrays.toString (array));
        System.out.println ("Sorting Array "+ Arrays.toString (selection_sort (array,length)));
    }
}
