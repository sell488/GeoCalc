package com.sell488.geocalc;

import javax.swing.*;

public class Main {

    public static void main(String... args) {
        //test values
        double rectLengthValue = 12;
        double recWidthValue = 12;

        Calculate calculations = new Calculate();

        //rectangle area
        calculations.rectangleArea(rectLengthValue, recWidthValue);

        //gets the answer and prints it out
        double solution = calculations.getArea();
        System.out.println(solution);
    }
}
