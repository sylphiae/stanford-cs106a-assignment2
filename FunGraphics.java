import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class FunGraphics extends GraphicsProgram {
    public void run() {

        GLabel label = new GLabel("hello, world", 100, 75);
        label.setFont("Sanserif-36");
        label.setColor(Color.RED);

        add(label);

        GRect rect1 = new GRect(10, 10, 50, 50);

        add(rect1);

        GRect rect2 = new GRect(300, 75, 200, 100);
        rect2.setFilled(true);
        rect2.setColor(Color.RED);

        add(rect2);

        GOval oval = new GOval(300, 75, 200, 100);
        oval.setFilled(true);
        oval.setFillColor(Color.GREEN);

        add(oval);

        GLine myFunkyLine = new GLine(100, 150, 200, 175);

        add(myFunkyLine);

        GLine dudeWheresMyLine = new GLine(0, 0, 100, 100);

        add(dudeWheresMyLine);
    }
}
