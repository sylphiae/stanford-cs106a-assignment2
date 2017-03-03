import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class HelloProgram extends GraphicsProgram {
    public void run () {
        GLabel label = new GLabel("hello world", 100, 75);
        label.setFont("SansSerif-36");
        label.setColor(Color.RED);
        add(label);
    }
}
