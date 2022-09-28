package com.code;

import java.awt.*;

public class class_object {
    public static void main(String[] args) {
        Point p1 = new Point (5, 6);
        Circle c1 = new Circle (p1, 45);
        System.out.println (c1.center);
        System.out.println (c1.getPerimeter ());
        c1.center = new Point (50, 60);
        c1.radius = 20;
        System.out.println (c1.center);
        System.out.println (c1.getPerimeter ());
        System.out.println (c1.getArea ());
        c1.setRadius (50);

    }

    public static class Circle {
        Point center;
        double radius;

        Circle(Point point, double radius) {
            this.radius = radius;
            this.center = point;
        }

        double getPerimeter() {
            return (2 * Math.PI * radius);
        }

        double getArea() {
            return (Math.PI * radius * radius);

        }

        void setRadius(double newRadius) {
            radius = newRadius;
        }

        void setCenter(Point newPointer) {
            center = newPointer;
        }

    }
}
