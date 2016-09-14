package HeadFirst.Template;

/**
 * Created by NikoBelic on 9/8/16.
 */
public abstract class CoffeineBeverage
{
    public final void prepareRecipe()
    {
        boil();
        brew();
        pourInCup();
        // 钩子方法   HOOK
        if (customerWantsCondiments())
        {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();
    public void pourInCup()
    {
        System.out.println("Pour Water in Cup..");
    }
    public void boil()
    {
        System.out.println("Boil the water...");
    }

    boolean customerWantsCondiments()
    {
        return true;
    }
}
