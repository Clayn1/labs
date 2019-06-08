package patterns.lab2.facade.lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CustomImage extends Frame{
    private ImageIcon imageIcon;

    public CustomImage() throws IOException {
        imageIcon = new ImageIcon("src/main/java/patterns/lab2/facade/TestImage.png");
    }
    public JLabel getLabeledImageIcon() {
        return new JLabel(imageIcon);
    }
    public void SetTransparency() {

    }
}
