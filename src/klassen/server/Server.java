package klassen.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Package: klassen.server
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 17.02.2018 2018
 */
public class Server {
    private ServerSocket server;

    public Server(int port){
        try {
            server = new ServerSocket(port);
            server.setSoTimeout(100000);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void serverRun(){
        while(true){
            try {
                System.out.println("Waiting für Client on "+ server.getLocalPort());
                Socket client = server.accept();
                DataInputStream input = new DataInputStream(client.getInputStream());
                System.out.println("Client input stream: "+ input.readUTF());
                System.out.println("Client Adresse: "+client.getRemoteSocketAddress());
                DataOutputStream output = new DataOutputStream(client.getOutputStream());
                output.writeUTF("Greeting");
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
