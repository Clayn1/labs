package patterns.lab1.composite;

public class OperationSymbol implements Expression{
    public static final String OPERATION_SYMBOLS = "+-/*";
    private char symbol;

    public OperationSymbol(char symbol) {
        if (OPERATION_SYMBOLS.contains(""+symbol)) {
            this.symbol = symbol;
        }else{
            throw new IllegalArgumentException("Wrong symbol: " + symbol);
        }
    }
    @Override
    public String getView() {
        return ""+symbol;
    }
    public Expression getContent(){
        return new OperationSymbol(symbol);
    }

    @Override
    public Expression getContent(int i) {
        return new OperationSymbol(symbol);
    }
}
