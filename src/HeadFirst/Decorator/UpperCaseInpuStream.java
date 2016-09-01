package HeadFirst.Decorator;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author NikoBelic
 * @create 16/9/1 13:51
 */
public class UpperCaseInpuStream extends MyFileInputDecorator
{
    InputStream inputStream;

    public UpperCaseInpuStream(InputStream inputStream)
    {
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        int c = inputStream.read();
        return c == -1?c:Character.toUpperCase((char)c);
    }
}
