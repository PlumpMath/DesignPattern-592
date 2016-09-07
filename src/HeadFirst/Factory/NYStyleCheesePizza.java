package HeadFirst.Factory;

/**
 * @author NikoBelic
 * @create 16/9/5 14:49
 */
public class NYStyleCheesePizza extends Pizza
{
    public NYStyleCheesePizza()
    {
        name = "NewYork Stype Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
