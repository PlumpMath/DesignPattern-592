package HeadFirst.Adapter;

/**
 * @author NikoBelic
 * @create 9/7/16 19:17
 */
public class WaterDuck implements Duck
{
    @Override
    public void quack() {
        System.out.println("GUAGUAGUA...");
    }

    @Override
    public void fly() {
        System.out.println("WaterDuck is flying..");
    }
}
