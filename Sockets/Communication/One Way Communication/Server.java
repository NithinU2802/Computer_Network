import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] arg) throws Exception{
    ServerSocket server=new ServerSocket(888);
    Socket socket=server.accept();

    BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));

    PrintWriter print=new PrintWriter(socket.getOutputStream());
    String msg;
    while((msg=br.readLine()) != null)
    print.println(msg);
    print.close();;
    
    }
}
