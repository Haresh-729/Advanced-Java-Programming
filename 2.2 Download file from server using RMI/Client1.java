import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class Client1 {
    public static void main(String[] args) throws
            NotBoundException, MalformedURLException,
            RemoteException, FileNotFoundException, IOException {
        System.out.println("Client Started --> ");
        String filename = "rights.txt";
        String filePath = "D:\\Haresh729";
        ArrayList<String> data = new ArrayList<String>();
        RemoteInterface1 FileInterface = (RemoteInterface1)Naming.lookup("rmi://192.168.1.205:6002/Servant1");
        if (FileInterface.CheckAvailability(filename)) {
            data = FileInterface.DownloadFiledata();
        }
        if (data != null) {
            String finalPath = filePath.concat(filename);
            File file = new File(filePath);
            file.createNewFile();
            if (file.exists()) {
                if (file.canRead()) {
                    FileWriter writer = new FileWriter(finalPath, true);
                    for (String line : data) {
                        writer.write(line);
                    }
                    System.out.println("Download Complete --> ");
                    writer.close();
                }
            }
        }
    }
}
