package com.sell488.geocalc;

public class Calculate {
double area = 0;

    public Calculate() {

    }

    public void rectangleArea (double length, double width) {
        area = length * width;
    }

    public void triangleArea (double base, double height) {
        area = (base * height) / 2;
    }

    public void circleArea (double radius) {
        area = (Math.pow(radius, 2)) * Math.PI;
    }

    public void trapezoid (double length1, double length2, double height) {
        area = ((length1 + length2) / 2) * height;
    }

    public double getArea() {
        return area;
    }
}
