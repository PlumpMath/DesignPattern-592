package HeadFirst.Factory;

/**
 * @author NikoBelic
 * @create 16/9/5 14:51
 */
public class ChicagoStyleCheesePizza extends Pizza
{
    public ChicagoStyleCheesePizza()
    {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}
