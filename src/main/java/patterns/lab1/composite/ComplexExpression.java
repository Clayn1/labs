package patterns.lab1.composite;

public class ComplexExpression implements Expression {
    private Expression firstExpression;
    private OperationSymbol operationSymbol;
    private Expression secondExpression;

    public ComplexExpression(Expression firstExpression, OperationSymbol operationSymbol, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.operationSymbol = operationSymbol;
        this.secondExpression = secondExpression;
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
