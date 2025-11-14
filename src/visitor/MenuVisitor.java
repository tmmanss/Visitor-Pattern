package visitor;

import pizza.HavaiiPizza;
import pizza.PepperoniPizza;
import pizza.PizzaInfo;

public class MenuVisitor implements Visitor {
    public PizzaInfo info = new PizzaInfo();

    @Override
    public void visit(PepperoniPizza pepperoniPizza) {
        info.name = "Pepperoni Pizza";
        info.cost = 6;
        info.ingredients = "Pepperoni Pizza Ingridients: are salami, cheese, vegetables, pepperoni";
        info.printInfo();
        System.out.println();
    }

    @Override
    public void visit(HavaiiPizza havaiiPizza) {
        info.name = "Havaii Pizza";
        info.cost = 5;
        info.ingredients = "Havaii Pizza ingridients: are pineapple, cheese, dough";
        info.printInfo();
        System.out.println();
    }
}
