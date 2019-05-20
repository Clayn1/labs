package patterns.lab1.composite;

public interface Expression {
    String getView();
    Expression getContent();
    Expression getContent(int i);
}
