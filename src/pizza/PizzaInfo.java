package pizza;

public class PizzaInfo {
    public String name;
    public int cost;
    public String ingredients;

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Cost: " + cost + "$");
        System.out.println("Ingredients: " + ingredients);
    }
}
