package pizza;

import visitor.Visitor;

public class HavaiiPizza implements Pizza {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
