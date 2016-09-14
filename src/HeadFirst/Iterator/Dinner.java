package HeadFirst.Iterator;

import java.util.Iterator;

/**
 * @author NikoBelic
 * @create 9/9/16 14:04
 */
public class Dinner implements Iterator
{
    MenuItem[] menuItems;

    private static final int MAX_SIZE = 10;
    private int num;
    private int position;
    public Dinner()
    {
        menuItems = new MenuItem[10];
    }

    public void addItem(String name , String desc,boolean vegetarian,double price)
    {
        MenuItem item = new MenuItem(name,desc,vegetarian,price);
        menuItems[num++] = item;
    }

    @Override
    public boolean hasNext()
    {
        if (this.position > MAX_SIZE || menuItems[position] == null)
            return false;
        return true;
    }

    @Override
    public Object next()
    {
        if (this.position <= MAX_SIZE && menuItems[position] != null)
        {
            return menuItems[position++];
        }
        return null;
    }
}
