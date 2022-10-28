// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Temp extends Applet
{
    public void paint(Graphics g)
    {
        // Draw 50 circles that go in a diagonal line

        int x = 20;
        int y = 20;
        int width = 30;
        int height = 30;
        for(int k = 0; k < 50; k++){
            g.drawOval(x, y, width,height);
            x += 5;
            y += 5;
        }



    }
}