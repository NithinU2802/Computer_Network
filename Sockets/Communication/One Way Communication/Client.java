import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] arg) throws Exception{
    Socket socket=new Socket("localhost", 888);

    DataOutputStream send=new DataOutputStream(socket.getOutputStream());
    // BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
    BufferedReader kr=new BufferedReader(new InputStreamReader(System.in));
    String msg;
    while(!((msg=kr.readLine()).toLowerCase()).equals("quit"))
    send.writeBytes(msg);
    }
}
