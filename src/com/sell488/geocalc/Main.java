package com.sell488.geocalc;

import javax.swing.*;

public class Main {

    public static void main(String... args) {
        //test values
        double lengthValue = 12;
        double widthValue = 12;

        Calculate calculations = new Calculate();

        System.out.println(calculations.rectangleArea(lengthValue, widthValue));
        System.out.println();
        System.out.println(calculations.triangleArea(lengthValue, widthValue));
    }
}
