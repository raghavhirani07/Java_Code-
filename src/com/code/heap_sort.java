package com.code;
import java.util.Arrays;
public class heap_sort {
   public static void hepify(int[] a , int n , int i){
        int largest = i ;
        int l = 2*i;
        int r = (2*i)+1;
        if(l<=n && a[l]>a[largest]){
            largest=l;
        }
        if (r<=n && a[r]> a[largest]){
            largest=r;
        }
        if(largest != i){
            // Swapping element
             int temp = a[i];
             a[i]=a[largest];
             a[largest]=temp;
             hepify (a,n,largest);
        }
    }
   public static void bulidheap(int[] a ,int n){
        for (int i = n/2; i >=0 ; i--) {
            hepify (a,n,i);
        }
    }
    public  static void  heapsort ( int[] a , int n ){
        for (int i = n; i >=0; i--) {
            int temp =a[i];
            a[i]=a[0];
            a[0]=temp;
            hepify (a,i-1,0);
        }
    }
    public static void main(String[] args) {
        int[] a  = {5, 6, 45, 18, 20, 93, 7};
        System.out.println ("Original Array " + Arrays.toString (a));
        bulidheap (a,a.length-1);
        heapsort (a,a.length-1);
        System.out.println ("After sorting "+Arrays.toString (a));
    }
}
