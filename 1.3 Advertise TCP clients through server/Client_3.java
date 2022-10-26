import java.io.*;
import java.net.*;

public class Client_3 {
    private Socket client_socket = null;
    private DataOutputStream output_stream = null;
    private DataInputStream input_stream = null;
    public Client_3(String host_address, int port_number) throws UnknownHostException,IOException
    {
        try
        {
//socket initialization
            client_socket = new Socket(host_address,port_number);
            System.out.println("Connected to Server");
            output_stream = new DataOutputStream(client_socket.getOutputStream());
//client to server communication
            System.out.println("Sending message to server >>");
            output_stream.writeUTF("Hello Server ..!!!");
//Server to client communication
            System.out.println("Accepting message from server >>");
            input_stream = new DataInputStream(client_socket.getInputStream());
            String message = input_stream.readUTF().toString();
            System.out.println(message);
            System.out.println();
//Closing connections
            output_stream.close();
            client_socket.close();
            input_stream.close();
        }
        catch(UnknownHostException e)
        {System.out.println(e); }
        catch(IOException e)
        { System.out.println(e); }
    }
}
