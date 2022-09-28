package com.code;

public class Array_basic_2 {
    public  void main(String[] args) {
        // arry passing to method like call by refence here noted arry is class
        int[] numbers = {0, 1};
        change(numbers);
        printArray(numbers);


    }

    public static void change(int[] numbers) {
        numbers[0] = 1;
        numbers[1] = 0;
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) System.out.print(number + " ");
    }
}
