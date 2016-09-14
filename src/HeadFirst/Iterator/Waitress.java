package HeadFirst.Iterator;

import java.util.Iterator;

/**
 * @author NikoBelic
 * @create 9/9/16 14:10
 */
public class Waitress
{
    private Breakfast breakfast;
    private Dinner dinner;

    public Waitress(Breakfast breakfast, Dinner dinner) {
        this.breakfast = breakfast;
        this.dinner = dinner;
    }

    public void printMenu()
    {
        System.out.println("MENU\n-------------------------\nBreakfast");
        printMenu(breakfast);
        System.out.println("Dinner");
        printMenu(dinner);
        System.out.println("");

    }
    public void printMenu(Iterator iterator)
    {
        while(iterator.hasNext())
        {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println("-- " + item.getName() + "," + item.getDesc() + ",$" + item.getPrice());
        }
    }
}
