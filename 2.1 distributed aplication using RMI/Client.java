import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;

public class Client {
    public static void main(String args[]) throws
            NotBoundException, MalformedURLException,
            RemoteException{
        RemoteInterface helloInterface = (RemoteInterface)
                Naming.lookup("rmi://192.168.1.205:6001/Hello");
        helloInterface.SayHello();
    }
}
