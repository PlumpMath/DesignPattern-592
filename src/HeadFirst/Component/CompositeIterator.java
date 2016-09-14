package HeadFirst.Component;

import org.w3c.dom.css.CSSImportRule;

import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

/**
 * @author NikoBelic
 * @create 9/13/16 14:18
 */
public class CompositeIterator implements Iterator
{
    Stack stack = new Stack();
    public CompositeIterator(Iterator iterator)
    {
        stack.push(iterator);
    }

    public Object next()
    {
        if (hasNext())
        {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent)iterator.next();
            if (component instanceof Menu)
            {
                stack.push(component.createIterator());
            }
            return component;
        }
        else
            return null;
    }

    public boolean hasNext()
    {
        if (stack.isEmpty())
            return false;
        else
        {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext())
            {
                stack.pop();
                return hasNext();
            }
            else
            {
                return true;
            }
        }
    }
}
