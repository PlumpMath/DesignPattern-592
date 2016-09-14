package HeadFirst.Iterator;

/**
 * @author NikoBelic
 * @create 9/9/16 14:09
 */
public class Test
{
    public static void main(String[] args)
    {
        // Set Breakfast & Dinner
        Breakfast breakfast = new Breakfast();
        breakfast.addItem("鸡蛋灌饼","鸡蛋+面",true,2.5);
        breakfast.addItem("煎饼","鸡蛋+面",true,4);
        breakfast.addItem("油条","面",true,0.5);
        breakfast.addItem("豆腐脑","豆腐",true,1.5);
        Dinner dinner = new Dinner();
        dinner.addItem("宫保鸡丁","鸡胸肉",false,20);
        dinner.addItem("糖醋里脊","鸡腿肉",false,25);
        dinner.addItem("糖醋鱼","鱼肉",false,45);

        Waitress waitress = new Waitress(breakfast,dinner);
        waitress.printMenu();

    }
}
