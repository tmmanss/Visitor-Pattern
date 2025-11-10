package visitor;
import pizza.HavaiiPizza;
import pizza.PepperoniPizza;


public interface Visitor {
    void visit(PepperoniPizza pepperoniPizza);
    void visit(HavaiiPizza havaiiPizza);
}
