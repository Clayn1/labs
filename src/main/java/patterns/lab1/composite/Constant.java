package patterns.lab1.composite;

public class Constant extends SimpleExpression{
    private double number;

    public Constant(int number) {
        this.number = number;
    }

    @Override
    public String getView() {
        return ""+number;
    }
}
