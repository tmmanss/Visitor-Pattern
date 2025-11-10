package visitor;

import pizza.HavaiiPizza;
import pizza.PepperoniPizza;

public class PizzaIngridientsVisitor implements Visitor {
    @Override
    public void visit(PepperoniPizza pepperoniPizza) {
        System.out.println("Pepperoni Pizza Ingridients: are salami, cheese, vegetables, pepperoni");
    }

    @Override
    public void visit(HavaiiPizza havaiiPizza) {
        System.out.println("Havaii Pizza ingridients: are pineapple, cheese, dough");
    }
}
