package com.code;

import java.awt.*;

public  class constructors{
   public static class Rectangle {
    int l;
    int h;
    Rectangle()
    {
        l=5;
        h=5;
    }

    Rectangle(int l, int h) {
        this.l = l;
        this.h = h;
    }

    int perimeter() {
        return (2*(l+h));

    }

}
    public static  void main(String[] args) {
    Rectangle r1=new Rectangle (5,6);
        System.out.println (r1.l+" "+r1.h);
        Rectangle r2=new Rectangle ();
        System.out.println (r2.l+" "+r2.h);

    }
}

