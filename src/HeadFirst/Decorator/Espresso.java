package HeadFirst.Decorator;

/**
 * Component
 * @author NikoBelic
 * @create 16/9/1 11:19
 */
public class Espresso extends Beverage
{

    @Override
    public Double cost() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return "Espreso Component...";
    }
}
