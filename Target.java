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
		int horizontalMidpoint = getWidth()/2;
		int verticalMidpoint = getHeight()/2;

        GOval test = new GOval(horizontalMidpoint, verticalMidpoint, 1, 1);
		GOval outerRedCircle = new GOval(horizontalMidpoint-72, verticalMidpoint-72, 144, 144);
		outerRedCircle.setColor(Color.RED);
		outerRedCircle.setFilled(true);
		outerRedCircle.setFillColor(Color.RED);
		add(outerRedCircle);

        GOval whiteCircle = new GOval (horizontalMidpoint-48.75, verticalMidpoint-48.75, 97.5, 97.5);
        whiteCircle.setColor(Color.WHITE);
        whiteCircle.setFilled(true);
        whiteCircle.setFillColor(Color.WHITE);
        add(whiteCircle);

        GOval innerRedCircle = new GOval (horizontalMidpoint-22.5, verticalMidpoint-22.5, 45, 45);
        innerRedCircle.setColor(Color.RED);
        innerRedCircle.setFilled(true);
        innerRedCircle.setFillColor(Color.RED);
        add(innerRedCircle);

        add(test);
	}
}
