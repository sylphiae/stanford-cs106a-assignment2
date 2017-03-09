/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Target extends GraphicsProgram {

    public void run() {
        drawCircle(144, Color.RED);
        drawCircle(97.5, Color.WHITE);
        drawCircle(45, Color.RED);
    }


    private void drawCircle(double diameter, Color fillColor) {
        GOval circle = (buildCircle(diameter));
        fillCircle(circle, fillColor);
        add(circle);
    }


    private void fillCircle(GOval circle, Color fillColor) {
        circle.setColor(fillColor);
        circle.setFilled(true);
        circle.setFillColor(fillColor);
    }


    private GOval buildCircle(double diameter) {
        double radius = diameter / 2;
        int horizontalMidpoint = getWidth() / 2;
        int verticalMidpoint = getHeight() / 2;
        return new GOval(horizontalMidpoint - radius, verticalMidpoint - radius, diameter, diameter);
    }


    /**GOval outerRedCircle = new GOval(horizontalMidpoint - 72, verticalMidpoint - 72, 144, 144);
     outerRedCircle.setColor(Color.RED);
     outerRedCircle.setFilled(true);
     outerRedCircle.setFillColor(Color.RED);
     add(outerRedCircle);

     GOval whiteCircle = new GOval(horizontalMidpoint - 48.75, verticalMidpoint - 48.75, 97.5, 97.5);
     whiteCircle.setColor(Color.WHITE);
     whiteCircle.setFilled(true);
     whiteCircle.setFillColor(Color.WHITE);

     add(whiteCircle);

     GOval innerRedCircle = new GOval(horizontalMidpoint - 22.5, verticalMidpoint - 22.5, 45, 45);
     innerRedCircle.setColor(Color.RED);
     innerRedCircle.setFilled(true);
     innerRedCircle.setFillColor(Color.RED);

     add(innerRedCircle);
     **/
}