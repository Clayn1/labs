package patterns.lab1.composite;

import java.util.ArrayList;

public class ComplexExpression implements Expression {
    private Expression firstExpression;
    private OperationSymbol operationSymbol;
    private Expression secondExpression;
    private ExpressionList expressionList = new ExpressionList();

    public ComplexExpression(Expression firstExpression, OperationSymbol operationSymbol, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.operationSymbol = operationSymbol;
        this.secondExpression = secondExpression;

        expressionList.add(firstExpression.getContent());
        expressionList.add(operationSymbol);
        expressionList.add(secondExpression.getContent());
    }
    public Expression getContent(){
        return expressionList;
    }

    @Override
    public Expression getContent(int i) {
        return expressionList.get(i);
    }

    @Override
    public String getView() {
        String firstExpressionFormatted;
        String secondExpressionFormatted;
        if (firstExpression instanceof SimpleExpression){
            firstExpressionFormatted = firstExpression.getView();
        }else{
            firstExpressionFormatted = "(" + firstExpression.getView() + ")";
        }
        if (secondExpression instanceof SimpleExpression){
            secondExpressionFormatted = secondExpression.getView();
        }else{
            secondExpressionFormatted = "(" + secondExpression.getView() + ")";
        }
        return firstExpressionFormatted+operationSymbol.getView()+secondExpressionFormatted;
    }
}
