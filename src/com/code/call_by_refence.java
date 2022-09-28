package com.code;

import java.awt.*;

public class call_by_refence {
    public static void main(String[] args) {
        Point p1=new Point();
        p1.x=1;
        p1.y=2;
        System.out.println("X="+p1.x+"  Y="+p1.y);

        change(p1);
        System.out.println("X="+p1.x+"  Y="+p1.y);


    }
    private static void change(Point p) {
        p.x = 2;
        p.y = 1;
    }

}
