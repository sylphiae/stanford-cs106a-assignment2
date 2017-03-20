/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {

    private static final int CLASS_BOX_WIDTH = 200;
    private static final int CLASS_BOX_HEIGHT = 60;

    public void run() {
        int horizontalMidpoint = getWidth() / 2;
        int verticalMidpoint = getHeight() / 2;

        Box parentProgram = new Box("Program", "Sanserif-36", CLASS_BOX_WIDTH / 2, CLASS_BOX_HEIGHT * 2 );
        parentProgram.drawBox(horizontalMidpoint, verticalMidpoint);

        /**GRect rect2 = new GRect(horizontalMidpoint - CLASS_BOX_WIDTH / 2, verticalMidpoint + CLASS_BOX_HEIGHT / 2, CLASS_BOX_WIDTH, CLASS_BOX_HEIGHT);
        add(rect2);

        GRect rect3 = new GRect(horizontalMidpoint - CLASS_BOX_WIDTH * 1.75, verticalMidpoint + CLASS_BOX_HEIGHT / 2, CLASS_BOX_WIDTH, CLASS_BOX_HEIGHT);
        add(rect3);

        GRect rect4 = new GRect(horizontalMidpoint + CLASS_BOX_WIDTH * 0.75, verticalMidpoint + CLASS_BOX_HEIGHT / 2, CLASS_BOX_WIDTH, CLASS_BOX_HEIGHT);
        add(rect4);

        GLabel label1 = new GLabel("Program", horizontalMidpoint - CLASS_BOX_WIDTH * 0.40, verticalMidpoint - CLASS_BOX_HEIGHT * 1.25);
        label1.setFont("Sanserif-36");
        add(label1);


        GLabel label2 = new GLabel("ConsoleProgram", horizontalMidpoint - CLASS_BOX_WIDTH * 0.40, verticalMidpoint + CLASS_BOX_HEIGHT * 1.20);
        label2.setFont("Sanserif-22");
        add(label2);
         **/
    }

    //The parent method outputs any parent class and its connection point;
    /**private void drawParent(double boxWidth, double boxHeight) {
        int horizontalMidpoint = getWidth() / 2;
        int verticalMidpoint = getHeight() / 2;

        GRect rect1 = new GRect(horizontalMidpoint - CLASS_BOX_WIDTH / 2, verticalMidpoint - CLASS_BOX_HEIGHT * 2, CLASS_BOX_WIDTH, CLASS_BOX_HEIGHT);
        add(rect1);
    }**/

    private class Box {
        String labelName;
        String labelFont;
        int xMidpointConnection;
        int yMidpointConnection;
        double horizontalOffset;
        double verticalOffset;

        public Box(String label, String font, double xOffset, double yOffset) {
            labelName = label;
            labelFont = font;
            horizontalOffset = xOffset;
            verticalOffset = yOffset;
        }

        public void drawBox(int horizontalMidpoint, int verticalMidpoint){
            GRect boxToDraw = new GRect(horizontalMidpoint - horizontalOffset, verticalMidpoint - verticalOffset, CLASS_BOX_WIDTH, CLASS_BOX_HEIGHT);
            add(boxToDraw);
            GLabel labeltoDraw = new GLabel(labelName, horizontalMidpoint - horizontalOffset, verticalMidpoint - verticalOffset);
            labeltoDraw.setFont(labelFont);
            add(labeltoDraw);
        }
    }

}

