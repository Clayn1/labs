package patterns.lab2.facade.lab1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class GraphicsFacade {
    private CustomImage customImage;
    private JButton buttonSetNewOpacity;
    private JFrame jFrame;

    public GraphicsFacade() throws IOException {
        jFrame = new JFrame();
        customImage = new CustomImage();
        JLabel labeledImageIcon = customImage.getLabeledImageIcon();
        jFrame.add(labeledImageIcon);
        jFrame.setSize(600, 600);
        labeledImageIcon.setLocation(jFrame.getWidth()/2,jFrame.getHeight()/2);
        //placeComponents();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        labeledImageIcon.setVisible(true);
        jFrame.setVisible(true);
    }
    private void placeComponents(){
        JButton buttonSetNewTransparency = new JButton();
        buttonSetNewOpacity = new JButton();
        Icon refreshIcon = new ImageIcon("src/main/java/patterns/lab2/facade/refresh.png");

        buttonSetNewOpacity.setSize(200, 200);
        buttonSetNewOpacity.setSelectedIcon(refreshIcon);
        buttonSetNewOpacity.setLocation(200,200);
        buttonSetNewOpacity.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Pressed");
            }
        });
        JPanel jPanel = new JPanel();
        jPanel.add(buttonSetNewOpacity);
        jFrame.add(jPanel);

    }
    public void setTransparency(float tr){

    }
    public void setOpacity(float op){

    }
    public void show(boolean isShown){

    }
}
