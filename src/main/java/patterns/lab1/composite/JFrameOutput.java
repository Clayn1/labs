package patterns.lab1.composite;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class JFrameOutput {
    private Expression expressionList;
    JFrame jFrame = new JFrame();
    Font font = new Font("Serif", Font.BOLD | Font.ITALIC, 36);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


    public JFrameOutput(Expression expressionList) {
        this.expressionList = expressionList;
    }

    public void placeInJFrame(){
        jFrame.setLocation((int) screenSize.getWidth() / 4, 50);
        jFrame.setSize((int)(screenSize.getWidth()/1.5), (int)(screenSize.getHeight()/1.5));
        jFrame.setResizable(true);

        setPlace(expressionList, 0,1);
        JLabel jLabelSome = new JLabel();
        jFrame.add(jLabelSome);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    public void setPlace(Expression content,int kx, int ky){
        Expression leftGottenContent = content.getContent(0);
        Expression rightGottenContent = content.getContent(2);

        JLabel jLabelOperationSymbol = new JLabel(content.getContent(1).getView());
        jLabelOperationSymbol.setSize(50,50);
        jLabelOperationSymbol.setLocation(400 + 150*kx,100 * ky);
        jLabelOperationSymbol.setFont(font);
        jFrame.add(jLabelOperationSymbol);

        if(!(leftGottenContent instanceof ExpressionList)) {
            JLabel jLabelLeft = new JLabel(content.getContent(0).getView());
            jLabelLeft.setSize(50, 50);
            jLabelLeft.setLocation(jLabelOperationSymbol.getX() - 75, 100 * (ky + 1));
            jLabelLeft.setFont(font);
            jFrame.add(jLabelLeft);
        }
        else {
            //jFrame.getGraphics().drawLine(jLabelOperationSymbol.getX()-75,100 * (ky + 1),jLabelOperationSymbol.getX()+150*(kx+1),100*(ky+1));
            setPlace(leftGottenContent, kx-1,ky + 1);
        }

        if (!(rightGottenContent instanceof ExpressionList)) {
            JLabel jLabelRight = new JLabel(content.getContent(2).getView());
            jLabelRight.setSize(50, 50);
            jLabelRight.setLocation(jLabelOperationSymbol.getX() + 75, 100 * (ky + 1));
            jLabelRight.setFont(font);
            jFrame.add(jLabelRight);
        }
        else {
            //jFrame.getGraphics().drawLine(jLabelOperationSymbol.getX()+75,100 * (ky + 1),jLabelOperationSymbol.getX()+150*(kx+1),100*(ky+1));
            setPlace(rightGottenContent,kx+1,ky + 1);
        }
    }
}
