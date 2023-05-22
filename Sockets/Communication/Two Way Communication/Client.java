import java.net.*;    // fetch package for networking 
import java.io.*;     // fetch the package for streaming input and output

public class Client{
    public static void main(String[] arg) throws Exception{  // Don't forget to make exception as if no connection need to handle error...!
     
    // Make socket to search for communication Host identification..!
    Socket socket=new Socket("localhost",888);

    // to send data to server 
    DataOutputStream send=new DataOutputStream(socket.getOutputStream());

    // get the data from server as send by it 
    BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));

    // Now get input from keyboard of client
    BufferedReader kr=new BufferedReader(new InputStreamReader(System.in));

    // make loop for continous communication...!
        String server,msg;
        System.out.print("Enter Message: ");
        while(!(msg=kr.readLine()).equals("quit")){
            send.writeBytes(msg+"\n");
            server=br.readLine();
            System.out.println(server);
            System.out.print("Enter Message: ");
        }

        // close connection
        socket.close();
        send.close();
        br.close();
        kr.close();

    }
}