package com.code;
import java.util.Scanner;
public class input_value {
    public static void main(String[] args) {
        // Reading takes from keyboard
        Scanner input = new Scanner(System.in)  ;

        System.out.println(input.nextLine());              // this is  read to blank or space


        Scanner input_number= new Scanner(System.in);
        System.out.println(input_number.nextInt());

    }
}
