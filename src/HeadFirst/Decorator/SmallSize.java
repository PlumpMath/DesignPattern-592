package HeadFirst.Decorator;

/**
 * @author NikoBelic
 * @create 16/9/1 13:27
 */
public class SmallSize extends SizeDecorator
{
    Beverage beverage;
    public SmallSize(Beverage beverage)
    {
        this.beverage = beverage;
    }
    @Override
    public Double cost() {
        return beverage.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " With SmallSize";
    }
}
