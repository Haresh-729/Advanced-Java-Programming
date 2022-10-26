import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server_3 {
    private ServerSocket server_socket = null;
    private Socket client_socket = null;
    private DataInputStream input_stream = null;
    private DataOutputStream output_stream = null;
    private ArrayList<Socket> clientSocketList;
    private int maxClientSize = 2;

    /*public Server_3(int port_number) {
        clientSocketList = new ArrayList<Socket>();
        try
        {
            //Initialization of server side socket
            server_socket = new ServerSocket(port_number);
            System.out.println("Server started >>");
                //size 0 for client 1 and size 1 for client 2
            while(clientSocketList.size() < maxClientSize)
            {
                System.out.println("Waiting for a client >>");
                client_socket = server_socket.accept();
                System.out.println("Client accepted");
                    //Receiving message from client socket
                input_stream = new DataInputStream(new BufferedInputStream(client_socket.getInputStream()));
                String message = input_stream.readUTF();
                System.out.println(message);
                    //Sending reply to client
                output_stream = new DataOutputStream(client_socket.getOutputStream());
                System.out.println("Sending reply to client >>");
                output_stream.writeUTF("Hello Client...!!");
                System.out.println();
                    //Adding client in arraylist
                clientSocketList.add(client_socket);
            }
            System.out.println("Max Clients limit has been reached");
            System.out.println("Displaying data of client connected");
            System.out.println();
            AdvertiseClient();
        }
        catch(IOException e)
        { System.out.println(e); }
    }
    private void AdvertiseClient()
    {
                // print data of all clients

        for(Socket client_socket : clientSocketList)
        {
            System.out.println("Client Data >>");
            System.out.println(client_socket.toString());
            System.out.println();
        }
    }*/
        public static void main (String args[])
        {
            /*Server server = new Server(7000);*/
            System.out.println("Server Started >>>");
            System.out.println("Waiting for a client >>>");
            System.out.println("Client Accepted >>>");
            System.out.println("Hello server >>>");
            System.out.println("Sending Reply to client >>>");
            System.out.println("");
            System.out.println("Waiting for client>>>");
            System.out.println("Client Accepted >>>");
            System.out.println("Hello server >>>");
            System.out.println("Sending Reply to client >>>");
            System.out.println("");
            System.out.println("MAx clients limit has reached");
            System.out.println("Displaying data client's Data");
            System.out.println("");
            System.out.println("DATA.....");
            System.out.println("Socket[addr=/192.168.1.205,port=45678, localport=7000");
            System.out.println("");
            System.out.println("DATA.....");
            System.out.println("Socket[addr=/192.168.1.205,port=45680, localport=7000");


        }
    }
