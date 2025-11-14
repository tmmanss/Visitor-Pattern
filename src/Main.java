import pizza.HavaiiPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import visitor.CostVisitor;
import visitor.MenuVisitor;
import visitor.PizzaIngridientsVisitor;
import visitor.Visitor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pizza pepperoni = new PepperoniPizza();
        Pizza hawaii = new HavaiiPizza();

        Visitor ingridientsVisitorvisitor = new PizzaIngridientsVisitor();
        Visitor costVisitor = new CostVisitor();

        System.out.println("---PIZZA INGRIDIENTS---");
        pepperoni.accept(ingridientsVisitorvisitor);
        hawaii.accept(ingridientsVisitorvisitor);

        System.out.println();

        System.out.println("---PIZZA COST---");
        pepperoni.accept(costVisitor);
        hawaii.accept(costVisitor);


        System.out.println("----- MENU -----");
        printPizzaInfo(pepperoni);
        printPizzaInfo(hawaii);
    }
    public static void printPizzaInfo(Pizza pizza) {
        MenuVisitor menuVisitor = new MenuVisitor();
        pizza.accept(menuVisitor);
        menuVisitor.info.printInfo();
    }
}