package HeadFirst.Decorator;

/**
 * @author NikoBelic
 * @create 16/9/1 11:18
 */
public abstract class Beverage
{
    public String description = "Unknown Beverage";
    public abstract Double cost();
    public String getDescription(){
        return description;
    }
}
