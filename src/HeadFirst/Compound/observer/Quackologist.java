package HeadFirst.Compound.observer;

/**
 * @author NikoBelic
 * @create 9/21/16 20:12
 */
public class Quackologist implements Observer
{
    @Override
    public void update(QuackObservable duck)
    {
        System.out.println("Quackologist: " + duck.getClass().getSimpleName() + " just quacked..");
    }
}
