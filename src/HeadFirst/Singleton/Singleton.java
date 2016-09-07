package HeadFirst.Singleton;

/**
 * @author NikoBelic
 * @create 16/9/6 09:55
 */
public class Singleton
{
    private volatile static Singleton instance;
    private Singleton(){}


    public static Singleton getInstance()
    {
        if (instance == null)
        {
            synchronized (Singleton.class)
            {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
