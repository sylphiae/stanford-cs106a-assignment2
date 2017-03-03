/*
 * File: YarnPattern.java
 * ----------------------
 * This program illustrates the use of the GLine class to simulate
 * winding a piece of colored yarn around a set of pegs equally
 * spaced along the edges of the canvas.  At each step, the yarn is
 * stretched from its current peg to the one DELTA pegs further on.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.util.*;

public class YarnPattern extends GraphicsProgram {

    /** Runs the program */
    public void run() {
        ArrayList pegs = createPegList();
        int thisPeg = 0;
        int nextPeg = -1;
        while (thisPeg != 0 || nextPeg == -1) {
            nextPeg = (thisPeg + DELTA) % pegs.size();
            GPoint p0 = (GPoint) pegs.get(thisPeg);
            GPoint p1 = (GPoint) pegs.get(nextPeg);
            GLine line = new GLine(p0.getX(), p0.getY(),
                    p1.getX(), p1.getY());
            line.setColor(Color.MAGENTA);
            add(line);
            thisPeg = nextPeg;
        }
    }

    /* Create an array list containing the locations of the pegs */
    private ArrayList createPegList() {
        ArrayList pegs = new ArrayList();
        for (int i = 0; i < N_ACROSS; i++) {
            pegs.add(new GPoint(i * PEG_SEP, 0));
        }
        for (int i = 0; i < N_DOWN; i++) {
            pegs.add(new GPoint(N_ACROSS * PEG_SEP, i * PEG_SEP));
        }
        for (int i = N_ACROSS; i > 0; i--) {
            pegs.add(new GPoint(i * PEG_SEP, N_DOWN * PEG_SEP));
        }
        for (int i = N_DOWN; i > 0; i--) {
            pegs.add(new GPoint(0, i * PEG_SEP));
        }
        return pegs;
    }

    /* Private constants */
    private static final int N_ACROSS = 50;
    private static final int N_DOWN = 30;
    private static final int PEG_SEP = 10;
    private static final int DELTA = 67;

}