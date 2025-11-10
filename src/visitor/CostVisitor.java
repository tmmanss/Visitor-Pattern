package visitor;

import pizza.HavaiiPizza;
import pizza.PepperoniPizza;

public class CostVisitor implements Visitor {
    @Override
    public void visit(PepperoniPizza pepperoniPizza) {
        System.out.println("Pepperoni Pizza: 7$");
    }

    @Override
    public void visit(HavaiiPizza havaiiPizza) {
        System.out.println("Havaii Pizza: 6$");
    }
}
