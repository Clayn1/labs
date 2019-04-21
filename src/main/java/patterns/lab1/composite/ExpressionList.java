package patterns.lab1.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class ExpressionList extends ArrayList<Expression> implements Expression{

    @Override
    public String getView() {
        Iterator<Expression> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            Expression e = it.next();

            sb.append(e == this ? "(this Collection)" : e.getView());
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }

    @Override
    public Expression getContent() {
        return null;
    }

    @Override
    public Expression getContent(int i) {
        return this.get(i);
    }
}
