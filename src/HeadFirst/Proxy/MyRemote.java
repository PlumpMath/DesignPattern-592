package HeadFirst.Proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by NikoBelic on 9/20/16.
 */
public interface MyRemote extends Remote
{
    String sayHello() throws RemoteException;
}
