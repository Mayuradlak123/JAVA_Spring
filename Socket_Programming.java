import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.spec.ECField;

public class Socket_Programming {
    public void Client_Architecture() throws UnknownHostException, IOException {
        ServerSocket ss=new ServerSocket(8080);
        Socket s= ss.accept();
        System.out.println("Connection Stablised : ");
        PrintStream ps=new PrintStream(s.getOutputStream());
        ps.print("Is Close Connection ");
        s.close();
    }

    public static void main(String[] args) {
        Socket_Programming sp= new Socket_Programming();
        try {
            sp.Client_Architecture();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}