package HeadFirst.Decorator;

/**
 * @author NikoBelic
 * @create 16/9/1 13:25
 */
public class BigSize extends SizeDecorator
{
    Beverage beverage;
    public BigSize(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return 1.0 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " With BigSize";
    }
}
