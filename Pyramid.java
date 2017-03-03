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
        for (int i = 0; i < BRICKS_IN_BASE; i++) {
            add(new GRect(horizontal_offset(i), vertical_offset(rowNumber), BRICK_WIDTH, BRICK_HEIGHT));
        }
    }

    public int horizontal_offset(int numberOfBricks) {
        int initialOffset = (getWidth() - BRICKS_IN_BASE * BRICK_WIDTH) / 2;
        return initialOffset + BRICK_WIDTH * numberOfBricks;
    }

    public int vertical_offset(int numberOfRows) {
        int initialVerticalOffset = (getHeight() - BRICK_HEIGHT);
        return initialVerticalOffset + BRICK_HEIGHT * numberOfRows;
    }
}

