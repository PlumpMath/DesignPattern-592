package HeadFirst.Component;

import java.util.Iterator;

/**
 * @author NikoBelic
 * @create 9/13/16 15:16
 */
public class NullIterator implements Iterator
{
    public Object next()
    {
        return null;
    }
    public boolean hasNext()
    {
        return false;
    }
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
