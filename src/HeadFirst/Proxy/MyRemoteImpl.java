package HeadFirst.Proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author NikoBelic
 * @create 9/20/16 15:37
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote
{
    public MyRemoteImpl() throws RemoteException
    {

    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello RMI";
    }

    public static void main(String[] args)
    {
        MyRemote service = null;
        try
        {
            service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        } catch (RemoteException e)
        {
            e.printStackTrace();
        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}
