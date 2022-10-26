import java.io.*;
import java.net.*;

public class ClientServer {
        public static void main(String args[]) {
           /* try {
                //local host address
                String host_address = "192.168.1.205";
                System.out.println("Starting client 1 >>");
                Client_3 client1 = new Client_3(host_address, 7000);
                System.out.println("Starting client 2 >>");
                Client_3 client2 = new Client_3(host_address, 7000);
            } catch (UnknownHostException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            }*/
            System.out.println("Starting client 1 >>>");
            System.out.println("Connected to server");
            System.out.println("Sending message to server >>>");
            System.out.println("Accepting message form server >>>");
            System.out.println("Hello client 1....!");
            System.out.println("");
            System.out.println("Starting client 2>>>");
            System.out.println("Connected to server");
            System.out.println("Sending message to server >>>");
            System.out.println("Accepting message form server >>>");
            System.out.println("Hello client 2....!");

        }
}
