package HeadFirst.Decorator;

/**
 * @author NikoBelic
 * @create 16/9/1 13:16
 */
public class Whip extends CondimentDecorator
{
    Beverage beverage;
    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.8;
    }
}
