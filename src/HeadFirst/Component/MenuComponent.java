package HeadFirst.Component;

import java.util.Iterator;

/**
 * Created by NikoBelic on 9/13/16.
 */
public abstract class MenuComponent
{
    public void add(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i )
    {
        throw new UnsupportedOperationException();
    }

    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    public String getDescription()
    {
        throw new UnsupportedOperationException();
    }

    public double getPrice()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian()
    {
        throw new UnsupportedOperationException();
    }

    public void print()
    {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator()
    {
        throw new UnsupportedOperationException();
    }
}
