package patterns.lab1.composite;

public class Main {
    public static void main(String[] args) {
        OperationSymbol firstExpressionOperationSymbol = new OperationSymbol('+');
        SimpleExpression firstSimpleExpression = new Constant(2);
        SimpleExpression secondSimpleExpression = new Variable("var");

        ComplexExpression firstComplexExpression = new ComplexExpression(firstSimpleExpression, firstExpressionOperationSymbol, secondSimpleExpression);

        System.out.println(firstComplexExpression.getView());

        OperationSymbol secondExpressionOperationSymbol = new OperationSymbol('/');
        SimpleExpression thirdSimpleExpression = new Variable("x");
        SimpleExpression forthSimpleExpression = new Variable("y");

       ComplexExpression secondComplexExpression = new ComplexExpression(thirdSimpleExpression, secondExpressionOperationSymbol, forthSimpleExpression);
        System.out.println(secondComplexExpression.getView());

        OperationSymbol thirdExpressionOperationSymbol = new OperationSymbol('*');

        ComplexExpression thirdComplexExpression = new ComplexExpression(firstComplexExpression, thirdExpressionOperationSymbol, secondComplexExpression);
        System.out.println(thirdComplexExpression.getView());

        OperationSymbol forthExpressionOperationSymbol = new OperationSymbol('/');
        SimpleExpression fifthSimpleExpression = new Variable("z");

        ComplexExpression forthComplexExpression = new ComplexExpression(fifthSimpleExpression, forthExpressionOperationSymbol, thirdComplexExpression);
        System.out.println(forthComplexExpression.getView());

        //System.out.println(Splitter.splitExpression(forthComplexExpression.getView()));
        //System.out.println(Splitter.splitExpression("(z/(2+t))/((2.0+var)*(x/y))"));
        System.out.println(forthComplexExpression.getContent().getView());

        JFrameOutput jFrameOutput = new JFrameOutput(forthComplexExpression);
        jFrameOutput.placeInJFrame();
    }
}