package HeadFirst.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author NikoBelic
 * @create 9/9/16 13:53
 */
public class Breakfast implements Iterator
{
    List<MenuItem> breakfastMenu;
    private int position;
    public Breakfast()
    {
        breakfastMenu = new ArrayList<>();
    }

    public void addItem(String name , String desc,boolean vegetarian,double price)
    {
        MenuItem item = new MenuItem(name,desc,vegetarian,price);
        this.breakfastMenu.add(item);
    }

    @Override
    public boolean hasNext()
    {
        if (this.position < breakfastMenu.size())
        {
            return true;
        }
        return false;
    }

    @Override
    public Object next()
    {
        if (this.position < breakfastMenu.size())
            return breakfastMenu.get(position++);
        return null;
    }


}
