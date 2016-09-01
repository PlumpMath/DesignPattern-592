package HeadFirst.Observer;

/**
 * 订阅者接口
 * @author NikoBelic
 * @create 16/8/30 18:47
 */
public interface Observer
{
    void update(int temperature,int wet,int pressure);
}
