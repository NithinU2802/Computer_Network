// Note: Don't Denote Package Name as it show an error as the file not an subpart of any package..!

import java.io.IOException;
import java.net.Socket;

public class Client{
    public static void main(String[] args) throws IOException{
        Socket s=new Socket("localhost", 4999);
    }
}
