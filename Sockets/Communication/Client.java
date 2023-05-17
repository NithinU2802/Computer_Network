import java.net.*;    // fetch package for networking 
import java.io.*;     // fetch the package for streaming input and output

public class Client{

    // make initialize socket, input and output 
    private Socket socket=null;
    private DataInputStream input=null;
    private DataOutputStream output=null;

    @SuppressWarnings("deprecation")
    public Client(String address,int port){

        // connection establishment 
        try{
            socket =new Socket(address, port);
            input=new DataInputStream(System.in);    // Intake the input from the terminal 
            output=new DataOutputStream(socket.getOutputStream());  // Display the message to the terminal 
        }catch(Exception e){
            System.out.println(e);
        }
        String data="";
        while(!data.equals("quit")){
            try{
                data=input.readLine();
                output.writeUTF(data);
            }catch(Exception e){
                System.out.println(e);
            }
            data=data.toLowerCase();
        }
    }
    public static void main(String[] arg){
        Client client=new Client("127.0.0.1", 6000);
    }
}