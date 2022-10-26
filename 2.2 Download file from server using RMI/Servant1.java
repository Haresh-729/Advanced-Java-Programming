import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
public class Servant1 extends UnicastRemoteObject implements RemoteInterface1{
    String path="D:\\Haresh729";
    String fullPath;
    public Servant1() throws RemoteException {
        super();
    }
    @Override
    public boolean CheckAvailability(String filename) throws
            RemoteException {
        boolean isAvailable = false;
        fullPath = path.concat(filename);
        File file = new File(fullPath);
        if(file.exists()){
            if (file.canRead()){
                System.out.println("File is Available");
                isAvailable = true;
            }
        }
        return isAvailable;
    }
    @Override
    public ArrayList<String> DownloadFiledata() throws RemoteException,
            FileNotFoundException, IOException {
        ArrayList<String>data= new ArrayList<String>();
        FileReader fileReader = new FileReader(fullPath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println("Reading File > ");
        String currentLine = bufferedReader.readLine();
        while (currentLine !=null){
            data.add(currentLine);
            currentLine =bufferedReader.readLine();
        }
        System.out.println("Read Complete --> ");
        fileReader.close();
        System.out.println("Transferring file to client");
        return data;
    }
}
