package com.code;

import java.util.Scanner;

public class loop_ex5 {
    public static void main(String[] args) {
        int maximum=0;
        int minimum= Integer.MAX_VALUE;
        Scanner s=new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter the number: ");
            int a = s.nextInt();
            if(a<0)
            {
                break;
            }
            if(a>=maximum)
            {
                maximum=a;
            }
            if(a<=minimum)
            {
                minimum=a;

            }

        }
        System.out.println("maximum is "+maximum);
        System.out.println("minimum is "+minimum);

    }
}
