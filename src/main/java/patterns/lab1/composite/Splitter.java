package patterns.lab1.composite;

import java.util.ArrayList;

public class Splitter {
    public static ArrayList<Expression> splitExpression(String expression) {
        ArrayList expressionArrayList = new ArrayList();
        deleteBrackets(expression);
        char[] expressionArray = expression.toCharArray();
        int bracketsDepth = 0;
        for (int i = 0; i < expressionArray.length; i++) {
            if(expressionArray[i] == '('){
                bracketsDepth++;
            }
            if(expressionArray[i] == ')'){
                bracketsDepth--;
            }
            if(OperationSymbol.OPERATION_SYMBOLS.contains(""+expressionArray[i]) && bracketsDepth == 0){
                String firstExpression = "";
                String secondExpression = "";
                for (int j = 0; j < i; j++) {
                    firstExpression += expressionArray[j];
                }
                for (int j = i+1; j < expressionArray.length; j++) {
                    secondExpression += expressionArray[j];
                }
                expressionArrayList.add(splitExpression(firstExpression));
                expressionArrayList.add(expressionArray[i]);
                expressionArrayList.add(splitExpression(secondExpression));
            }
        }
        /*String[] splittedExpression = expression.split("(((?<=[+\\*\\/\\-])|(?=[+\\*\\/\\-]))(?![^(]*[)]))");
        for (int i = 0; i < splittedExpression.length; i++) {
            splitExpression(splittedExpression[i]);
        }*/
        
        return expressionArrayList;
    }

    public static String deleteBrackets(String expression) {
        int bracketDepth = 0;
        char[] expressionArray = expression.toCharArray();
        if(expressionArray[0] == '(') {
            for (int i = 0; i < expression.length() - 1; i++) {
                if (expressionArray[i] == '(') {
                    bracketDepth++;
                }
                if (expressionArray[i] == ')') {
                    bracketDepth--;
                }
            }
        }
        if (bracketDepth == 1){
            expression = ((new StringBuilder(expression)).deleteCharAt(0)).toString();
            expression = ((new StringBuilder(expression)).deleteCharAt(expression.length()-1)).toString();
        }
        return expression;
    }
}
