package com.code;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Arry_list_ex2 {
    public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<> ();
while (true)
        {
            System.out.println ("1 .  ADD");
            System.out.println ("2 .  Remove");
            System.out.println ("3 .  Display");
            System.out.println ("4 .  Exit");
            System.out.print("Enter your choice: ");
            Scanner input = new Scanner (System.in);
            int n = input.nextInt ();
            if (n == 1) {
                System.out.print("Enter the number :");
                int a = input.nextInt ();
                number.add (a);
            } else if (n == 2) {
                System.out.print("Enter the number :");
                int a = input.nextInt ();
                if (number.contains(a)) {
                    number.remove(Integer.valueOf (a));
                    System.out.println ("Removed");
                } else {
                    System.out.println ("you Enter number is not Found in ArrayList");
                }
            } else if (n == 3) {
                System.out.println(number);
            } else if (n == 4) {
                System.out.println ("Bye..");
                exit (0);
            } else {
                System.out.println ("Jara dekh kar type kariye");
            }

        }
    }
}
