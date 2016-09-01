package HeadFirst.Decorator;

import java.io.*;

/**
 * @author NikoBelic
 * @create 16/9/1 13:55
 */
public class FIleInputDecoratorTest
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = new FileInputStream(new File("/Users/lixiwei-mac/Documents/IdeaProjects/DesignPattern/src/HeadFirst/Decorator/input.txt"));
        InputStream upperCaseInpuStream = new UpperCaseInpuStream(new BufferedInputStream(inputStream));
        int c;
        while((c = upperCaseInpuStream.read()) != -1)
        {
            System.out.print((char)c);
        }
    }
}
