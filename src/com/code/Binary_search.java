package com.code;
import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter the length of array : ");
        int length = input.nextInt ();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt ();
        }
        System.out.print ("Enter the Key : ");
        int key =input.nextInt ();
        System.out.println (binary_search(array,0,length-1,key) ? "Key Found in array" : "Key not Found in array");
    }
    public static boolean binary_search(int[] array, int low, int high, int key) {
        while(low <= high) {
            int mid=(low+high)/2;
            if (array[mid] == key) {
                return true;

            } else if (array[mid] < key) {
                low = mid+1;
            }
            else {
                high = mid -1;
            }
        }
        return false;
    }
}
