package com.code;

import java.util.ArrayList;

public class For_Each {
    public static void main(String[] args) {
        ArrayList<Integer> item=new ArrayList<>();
        item.add(5);
        item.add(4);
        item.add(2);
        item.add(1);
        for (Integer integer: item) {
            System.out.print(integer+" ");
        }
        System.out.println(" ");
        int[] number={5,2,2,0};
        int i =0;
        for (int integer : number) {
            System.out.println(integer+" "+(i++));
        }



    }
}
