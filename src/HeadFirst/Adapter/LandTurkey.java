package HeadFirst.Adapter;

/**
 * @author NikoBelic
 * @create 9/7/16 19:18
 */
public class LandTurkey implements Turkey
{
    @Override
    public void gobble() {
        System.out.println("GOGOGOGOGOG...");
    }

    @Override
    public void fly() {
        System.out.println("LandTurkey is flying...");
    }
}
