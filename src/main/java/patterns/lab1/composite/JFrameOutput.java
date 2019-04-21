package patterns.lab1.composite;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class JFrameOutput {
    private Expression expressionList;
    JFrame jFrame = new JFrame();
    Font font = new Font("Serif", Font.BOLD | Font.ITALIC, 15);

    public JFrameOutput(Expression expressionList) {
        this.expressionList = expressionList;
    }
    public void placeInJFrame(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation((int) screenSize.getWidth() / 4, 50);
        jFrame.setSize((int)screenSize.getWidth()/2, (int)screenSize.getHeight()/2);
        jFrame.setResizable(true);

        //JScrollPane jScrollPane = new JScrollPane(jFrame, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //jScrollPane.setSize(600, 200);
        //jScrollPane.setLocation(20, 400);
        //jFrame.add(jScrollPane);
        placeFirstExpressions((int)screenSize.getWidth()/6,100,0);
        placeOperationSymbol((int)screenSize.getWidth()/4,50,1);
        placeSecondExpressions((int)screenSize.getWidth()/2,100,2);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    public Expression placeFirstExpressions(int x, int y, int i){
        JLabel jLabel = new JLabel(expressionList.getContent(i).getView());
        jLabel.setSize(500,500);
        jLabel.setLocation(x - 100*i, y + 50*i);
        jLabel.setFont(font);
        jFrame.add(jLabel);
        try {
            return placeFirstExpressions(x, y, i + 3);
        }catch (IndexOutOfBoundsException e){
            return null;
        }
    }
    public Expression placeOperationSymbol(int x, int y, int i){
        JLabel jLabel = new JLabel(expressionList.getContent(i).getView());
        jLabel.setSize(500,500);
        jLabel.setLocation(x + 100*i, y + 50*i);
        jLabel.setFont(font);
        jFrame.add(jLabel);
        try {
            return placeFirstExpressions(x, y, i + 3);
        }catch (IndexOutOfBoundsException e){
            return null;
        }
    }
    public Expression placeSecondExpressions(int x, int y, int i){
        JLabel jLabel = new JLabel(expressionList.getContent(i).getView());
        jLabel.setSize(500,500);
        jLabel.setLocation(x + 100*i, y + 50*i);
        jLabel.setFont(font);
        jFrame.add(jLabel);
        try {
            return placeFirstExpressions(x, y, i + 3);
        }catch (IndexOutOfBoundsException e){
            return null;
        }
    }
}
