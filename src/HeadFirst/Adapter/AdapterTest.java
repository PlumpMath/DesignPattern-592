package HeadFirst.Adapter;

/**
 * @author NikoBelic
 * @create 9/7/16 19:18
 */
public class AdapterTest
{
    public static void main(String[] args)
    {
        WaterDuck duck = new WaterDuck();
        LandTurkey turkey = new LandTurkey();
        TurkeyAdapter adapter = new TurkeyAdapter(turkey);
        duck.quack();
        adapter.quack();
        duck.fly();
        adapter.fly();
    }
}
