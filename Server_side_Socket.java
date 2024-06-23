import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server_side_Socket {
    public void Server_Side_Architecture() throws UnknownHostException, IOException {
        Socket s= new Socket("localhost",8080);
        System.out.println("Server is Ready to accept request: ");
    }

    public static void main(String[] args) {
        Server_side_Socket ob=new Server_side_Socket();
        try {
            ob.Server_Side_Architecture();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
