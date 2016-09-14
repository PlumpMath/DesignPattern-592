package HeadFirst.Component;

/**
 * @author NikoBelic
 * @create 9/13/16 10:34
 */
public class Test
{
    public static void main(String[] args)
    {
        MenuComponent cakeMenu = new Menu("Pancake Menu","Breakfase");
        MenuComponent dinnerMenu = new Menu("Dinner Menu","Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu","Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu","Dessert of course!");

        MenuComponent allMenus = new Menu("All Menus","All menus combined");

        allMenus.add(cakeMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        dinnerMenu.add(new MenuItem("Pasta","Sauce & Bread",true,3.89));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie","Apple & Ice cream",true,1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
