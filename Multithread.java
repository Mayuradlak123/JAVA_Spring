import  java.lang.Runnable;

public class Multithread implements  Runnable{
    @Override
    public void run() {
        int i=0;
        for(i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Multithread ob=new Multithread();
        Thread th=new Thread(ob);
        MultiThreading m1=new MultiThreading();
        th.start();
        m1.start();

    }
}
