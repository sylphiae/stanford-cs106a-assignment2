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
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		/* You fill this in. */
		int offset = (getWidth()-14*30)/2;
		GRect brick = new GRect(offset, getHeight()-12, 30, 12);
		add(brick);

		for (int i = 1; i < 14; i ++) {
			brick = new GRect(offset(i), getHeight()-12, 30, 12);
			add(brick);
		}
	}

	public int offset(int numberOfBricks){
		int initialOffset = (getWidth()-14*30)/2;
		return initialOffset + 30 * numberOfBricks;
	}
}

