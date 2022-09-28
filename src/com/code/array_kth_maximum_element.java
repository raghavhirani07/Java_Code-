package com.code;
import java.util.Scanner;
public class array_kth_maximum_element {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 2, 1, 4, 5, 8, 7, -1, 10,20};
        Scanner input = new Scanner (System.in);
        System.out.println (numbers.length/2);
        System.out.print ("Enter the kth maximium element :");
        int k = input.nextInt ();
        if (k > numbers.length) {
            System.out.println ("Please enter the k under the value of " + numbers.length);
        }
        else if (k <= (numbers.length/2)) {
            for (int i = 0; i < k; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    if (numbers[j] >= numbers[i]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }
        else {
            for (int i = numbers.length-1; i >= k-1; i--) {
                for (int j = i-1; j >= 0; j--) {

                    if (numbers[j] <= numbers[i]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }

                }
            }
        }
       /* for (int n:
             numbers) {
            System.out.print (n+" ");
        }*/
        System.out.println (numbers[k-1]);
    }
}
