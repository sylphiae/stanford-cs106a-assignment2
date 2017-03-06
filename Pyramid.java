/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {

    /**
     * Width of each brick in pixels
     */
    private static final int BRICK_WIDTH = 30;

    /**
     * Width of each brick in pixels
     */
    private static final int BRICK_HEIGHT = 12;

    /**
     * Number of bricks in the base of the pyramid
     */
    private static final int BRICKS_IN_BASE = 14;

    public void run() {
        //int baseBricks = 14;
        for (int i = 0; i < BRICKS_IN_BASE; i++) {
            buildRow(i);
        }

    }

    public void buildRow(int rowNumber) {
        for (int i = 0; i < BRICKS_IN_BASE-rowNumber; i++) {
            //println(BRICKS_IN_BASE-rowNumber);
            //println("i" + i);
            add(new GRect(horizontalOffset(i, rowNumber) + BRICK_WIDTH * rowNumber, verticalOffset(rowNumber), BRICK_WIDTH, BRICK_HEIGHT));
        }
    }

    public int horizontalOffset(int numberOfBricks, int rowNumber) {
        int initialOffset = ((getWidth() - BRICKS_IN_BASE * BRICK_WIDTH) / 2);
        int rowOffset = BRICK_WIDTH/2 * rowNumber;
        println("horizontal offset" + (initialOffset + BRICK_WIDTH * numberOfBricks));
        return initialOffset -rowOffset + BRICK_WIDTH * numberOfBricks;
    }

    public int verticalOffset(int numberOfRows) {
        int initialVerticalOffset = (getHeight() - BRICK_HEIGHT);
        println("vertical offset" + (initialVerticalOffset + BRICK_HEIGHT * numberOfRows));
        return initialVerticalOffset - BRICK_HEIGHT * numberOfRows;
    }
}

