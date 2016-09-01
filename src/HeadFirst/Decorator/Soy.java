package HeadFirst.Decorator;

/**
 * @author NikoBelic
 * @create 16/9/1 13:15
 */
public class Soy extends CondimentDecorator
{
    Beverage beverage;
    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.5;
    }

}
