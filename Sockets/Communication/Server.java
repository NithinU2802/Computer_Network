import java.net.*;
import java.io.*;

public class Server {

    // Initialize socket, ServerSocket and InputStream ...! 
    private Socket socket=null;
    private ServerSocket server=null;
    private DataInputStream input=null;

    @SuppressWarnings("deprecation")
    public Server(int port){
        try{
            server =new ServerSocket(port);
            System.out.println("Server Started...!");
            System.out.println("Waiting for Client....?");
            socket=server.accept();
            System.out.println("Client Accepted... :)");

            // take input from the client
            input=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String data="";
            while(!data.equals("quit")){
                try{
                    data=input.readLine();
                    System.out.println(data);
                }catch(Exception e){
                    System.out.println(e);
                }
                data=data.toLowerCase();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] arg){
    Server serve=new Server(6000);
    }
}
