// Note: Don't Denote Package Name as it show an error as the file not an subpart of any package..!

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] arg) throws IOException{
        ServerSocket ss=new ServerSocket(4999);
        Socket s=ss.accept();
        System.out.print("Client is Connected...!");
    }
}
