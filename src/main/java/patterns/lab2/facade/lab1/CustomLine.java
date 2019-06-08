package patterns.lab2.facade.lab1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class CustomLine {
    private Line2D line;

    public CustomLine() {
        line = new Line2D.Float(30,30,130,30);

    }
    public void paint(Graphics g){
        g.drawLine(50, 50, 600, 50);
        g.drawLine(600, 50, 600, 450);
        g.drawLine(600, 450, 50, 450);
        g.drawLine(50, 450, 50, 50);
    }

    public void setOpacity(float op){

    }
}
