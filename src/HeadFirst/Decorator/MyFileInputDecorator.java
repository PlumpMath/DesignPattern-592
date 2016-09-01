package HeadFirst.Decorator;

import java.io.IOException;
import java.io.InputStream;

/**
 * 自创文件装饰者,来读取文件。
 * @author NikoBelic
 * @create 16/9/1 13:50
 */
public abstract class MyFileInputDecorator extends InputStream
{
    @Override
    public abstract int read() throws IOException;
}
