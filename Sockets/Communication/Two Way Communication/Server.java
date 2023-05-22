import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] arg) throws Exception{ // Don't forget to make exception as if no connection need to handle error...!
    
    // Create Server Socket for Connection establishment (search for client)
    ServerSocket server=new ServerSocket(888);

    // Now connect it to client socket on the network
    Socket socket=server.accept();
    System.out.println("Client has been connected...:)");

    // start to send message towards client
    PrintStream send=new PrintStream(socket.getOutputStream());

    // Now read data which came from the client 
    BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));

    // Read input form the server keyboard
    BufferedReader kr=new BufferedReader(new InputStreamReader(System.in));
    

    // Make a loop for continous communication
        String client,msg;
        while((client=br.readLine())!=null){
            System.out.println("Form Client: "+client);
            System.out.print("Enter Message: ");
            msg=kr.readLine();
            send.println("From Server: "+msg);
        }

        // close connections 
        socket.close();
        server.close();
        send.close();
        br.close();
        kr.close();       

    }
}

