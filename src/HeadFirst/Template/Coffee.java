package HeadFirst.Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author NikoBelic
 * @create 9/8/16 21:03
 */
public class Coffee extends CoffeineBeverage
{
    @Override
    void brew()
    {
        System.out.println("Dripping Coffee through filter...");
    }

    @Override
    void addCondiments()
    {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments()
    {
        if (getUserInput().startsWith("y"))
            return true;
        return false;
    }

    private String getUserInput()
    {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            answer = bufferedReader.readLine();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        if (answer == null)
            return "no";
        return answer;
    }
}
