import java.io.*;
import java.net.*;

public class Server {
    private ServerSocket server_socket = null;
    private Socket client_socket =null;
    private DataInputStream input_stream = null;
    public Server(int port_number)
    {
        try
        {
//Initialization of server side socket
            server_socket = new ServerSocket(port_number);
            System.out.println("Server started >>");
            System.out.println("Waiting for a client >>");
            client_socket = server_socket.accept();
            System.out.println("Client accepted");
//Receiving message from client socket
            input_stream=new DataInputStream(new BufferedInputStream(client_socket.getInputStream()));
            String message = input_stream.readUTF();
            System.out.println(message);
//Closing connections
            client_socket.close();
            input_stream.close();
        }
        catch(IOException e)
        { System.out.println(e);}
    }
    public static void main(String args[])
    {
        Server server = new Server(6060);
    }
}

