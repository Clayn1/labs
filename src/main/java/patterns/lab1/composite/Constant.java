package patterns.lab1.composite;

public class Constant extends SimpleExpression{
    private int number;

    public Constant(int number) {
        this.number = number;
    }

    @Override
    public String getView() {
        return ""+number;
    }

    public Expression getContent(){
        return new Constant(number);
    }

    @Override
    public Expression getContent(int i) {
        return new Constant(number);
    }
}
