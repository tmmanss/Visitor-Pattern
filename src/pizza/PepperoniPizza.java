package pizza;

import visitor.Visitor;

public class PepperoniPizza implements Pizza {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
