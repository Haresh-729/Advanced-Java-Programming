import java.io.*;
import java.net.*;

public class Client {
    private Socket client_socket = null;
    private DataOutputStream output_stream = null;

    public Client(String host_address, int port_number) throws UnknownHostException,IOException
    {
        try
        {
//socket initialization
            client_socket = new Socket(host_address,port_number);
            System.out.println("Connected to Server");
            output_stream = new DataOutputStream(client_socket.getOutputStream());
            output_stream.writeUTF("Hello Server ..!!!");
//Closing connections
            output_stream.close();
            client_socket.close();
        }
        catch(UnknownHostException e)
        { System.out.println(e); }
        catch(IOException e)
        { System.out.println(e); }
    }
    public static void main(String args[])
    {
        try
        {
//local host address
            String host_address = "127.0.1.1";
            Client client = new Client(host_address,6060);
        }
        catch(UnknownHostException e)
        { System.out.println(e); }
        catch(IOException e)
        { System.out.println(e); }
    }
}
