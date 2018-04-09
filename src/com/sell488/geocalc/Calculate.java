package com.sell488.geocalc;

public class Calculate {
double area = 0;

    public static double rectangleArea (double length, double width) {

        return length * width;
    }

    public static double triangleArea (double base, double height) {

        return (base * height) / 2;
    }

    public static double circleArea (double radius) {
        return radius * radius * Math.PI;
    }

    public static double trapezoid (double length1, double length2, double height) {
        return ((length1 + length2) / 2) * height;
    }

}
