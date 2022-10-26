import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Server1 {
    public static void main(String[] args) throws RemoteException {
        System.out.println("Server Started --> ");
        Registry registry = LocateRegistry.createRegistry(6002);
        registry.rebind("Servant1",new Servant1());
    }
}
