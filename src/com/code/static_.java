package com.code;

import java.awt.*;

public class static_ {
    public static void main(String[] args) {
        System.out.println (Circle.getNumber_of_object ());
        Circle c1 = new Circle (new Point (3, 4), 5);
        System.out.println (Circle.getNumber_of_object ());
        Circle c2 = new Circle (new Point (1, 2), 3);
        System.out.println (Circle.getNumber_of_object ());
    }

    public static class Circle {
        static int number_of_object = 0;
        Point center;
        double radius;

        Circle(Point point, double radius) {
            this.radius = radius;
            this.center = point;
            number_of_object++;
        }

        Circle() {
            number_of_object++;
        }

        static int getNumber_of_object() {
            return number_of_object;
        }

        double getPerimeter() {
            return (2 * Math.PI * radius);
        }

        void setRadius(double newRadius) {
            radius = newRadius;
        }

        void setCenter(Point newPointer) {
            center = newPointer;
        }


    }
}
