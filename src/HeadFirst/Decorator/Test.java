package HeadFirst.Decorator;

/**
 * @author NikoBelic
 * @create 16/9/1 13:17
 */
public class Test
{
    public static void main(String[] args)
    {
        Beverage espressp = new Espresso();
        Beverage finalBeverage = new BigSize(new Mocha(new Soy(new Whip(espressp))));
        System.out.println(finalBeverage.getDescription());
        System.out.println("cost:" + finalBeverage.cost());
    }
}
