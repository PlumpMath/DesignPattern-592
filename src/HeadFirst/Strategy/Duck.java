package HeadFirst.Strategy;

/**
 * @author NikoBelic
 * @create 16/8/30 13:01
 */
public abstract class Duck
{
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }
    public void performFly()
    {
        this.flyBehavior.fly();
    }
    public void performQuack()
    {
        this.quackBehavior.quack();
    }
    public void swim()
    {
        System.out.println("Duck is swimming...");
    }
    public abstract void display();
}
