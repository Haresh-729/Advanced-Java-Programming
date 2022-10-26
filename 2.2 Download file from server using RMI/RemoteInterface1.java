import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RemoteInterface1 extends Remote {
    public boolean CheckAvailability(String filename) throws
            RemoteException;
    public ArrayList<String> DownloadFiledata() throws
            RemoteException, FileNotFoundException,
            IOException;
}

