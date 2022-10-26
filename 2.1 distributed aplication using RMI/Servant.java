import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Servant extends UnicastRemoteObject implements RemoteInterface {
    public Servant()throws RemoteException{
        super();
    }
    public void SayHello()throws RemoteException{
        System.out.println("Hello, Haresh Here");
    }
}
