package HeadFirst.Decorator;

/**
 * @author NikoBelic
 * @create 16/9/1 11:24
 */
public class Mocha extends CondimentDecorator
{
    Beverage beverage;

    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha.";
    }

    @Override
    public Double cost() {
        return 0.2 + beverage.cost();
    }
}
