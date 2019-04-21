package patterns.lab1.composite;

public class Variable extends SimpleExpression {
    private String varName;

    public Variable(String varName) {
        if(!Character.isAlphabetic(varName.charAt(0))){
            throw new IllegalArgumentException("First character of variable name must be letter");
        }
        this.varName = varName;
    }

    @Override
    public String getView() {
        return varName;
    }

    public Expression getContent(){
        return new Variable(varName);
    }

    @Override
    public Expression getContent(int i) {
        return new Variable(varName);
    }
}
