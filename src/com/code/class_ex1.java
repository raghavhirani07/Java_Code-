package com.code;

import java.util.Scanner;

public class class_ex1 {

    public static void main(String[] args) {
        Rectangle[] arr=new Rectangle[3];
        Scanner input=new Scanner (System.in);
        for (int i = 0; i <arr.length; i++) {
            System.out.print ("Enter the value of height and width: ");
            arr[i] =new Rectangle (input.nextDouble (), input.nextDouble ());
            System.out.println ("Area is "+ arr[i].getArea ()+" perimeter is "+ arr[i].getPerimeter ());


        }

    }

    public static class Rectangle {
        private double width;
        private double height;

        Rectangle() {
            width = 1.0;
            height = 1.0;
        }

        Rectangle(double width, double height) {
            this.height = height;
            this.width = width;
        }

        public double getArea() {
            return (height * width);

        }

        public double getPerimeter() {
            return (2 * height * width);
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

    }
}
