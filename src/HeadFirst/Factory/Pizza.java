package HeadFirst.Factory;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author NikoBelic
 * @create 16/9/5 14:41
 */
public abstract class Pizza
{
    String name;
    String dough;
    String sauce;

    ArrayList toppings = new ArrayList();

    void prepare()
    {
        System.out.println("准备:" + name);
        System.out.println("烘烤:" + dough);
        System.out.println("刷酱:" + sauce);
        System.out.println("作料:");
        for (Object topping :toppings)
        {
            System.out.println("  " + topping);
        }
    }

    void bake()
    {
        System.out.println("烘烤25分钟");
    }
    void cut()
    {
        System.out.println("切Pizza");
    }
    void box()
    {
        System.out.println("包装Pizza");
    }
    public String getName()
    {
        return name;
    }
}
