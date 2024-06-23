import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.concurrent.locks.ReadWriteLock;

class Producer{
    // This is constructor
    ServerSocket server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;


    public Producer(){
        try{
            server=new ServerSocket(7777);
            System.out.println("Server is ready to ecept connection: ");
            System.out.println("Waiting: ");
            socket=server.accept();
            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out=new PrintWriter(socket.getOutputStream());
            startReading();
            startWriting();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void startReading(){
        //This thread is use for read data
        Runnable r1=()->{
            while(true){
                try{
                    String msg=br.readLine();
                    if(msg.equals("exit")){
                        System.out.println("Client terminated the chat: ");
                        break;
                    }
                    System.out.println("Client: "+msg);

                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        };
        new Thread(r1).start();
    }
    public void startWriting(){
        System.out.println("Writer Started : ");
        // Thread data user lega and than send karega
        Runnable r2=()->{
            while(true){
                try{
                    BufferedReader br1 =new BufferedReader(new InputStreamReader(System.in));
                    String content =br1.readLine();
                    out.println(content);
                    out.flush();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        };
        new Thread(r2).start();
    }
    public static void main(String[] args) {
        System.out.println("This is Server Going to start : ");
        new Producer();
    }
}