package com.code;
import java.util.Arrays;
import java.util.Scanner;
public class merge_sort {
        public static void divide (int arr[],int start , int end ){
        if(start >= end ){
            return;
        }
        int mid = (start + end )/2;
        divide (arr,start,mid);
        divide (arr,mid+1,end);
        conquer(arr,start,mid ,end);
    }

    public static void conquer(int arr[], int start, int mid, int end) {
        int[] temp = new int [end - start + 1];
        int index1 =start;
        int index2=mid+1;
        int x =0;
        while (index1 <= mid && index2 <= end){
            if(arr[index1] <= arr[index2]){
                temp[x++]=arr[index1++];
            }
            else{
                temp[x++]=arr[index2++];
            }
        }
        while(index1 <= mid){
            temp[x++]=arr[index1++];
        }
        while(index2 <= end) {
            temp[x++] = arr[index2++];
        }
        for (int i = 0 , j = start; i < temp.length ; i++,j++) {
            arr[j]=temp[i];
        }
    }

    public static void main(String[] args) {
        System.out.println ("Enrollment no. = 200130107068");
        System.out.println ("Name = Hirani Raghav");
        Scanner input =new Scanner (System.in);
        System.out.print("Enter the length of array : ");
        int length = input.nextInt ();
        int[] array =new int[length];
        for (int i = 0; i <length ; i++) {
            array[i]=input.nextInt ();
        }
        divide (array,0,length-1);
        System.out.println (" sorting Array :" + Arrays.toString (array));
    }
}
