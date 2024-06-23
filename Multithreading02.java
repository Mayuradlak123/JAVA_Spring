import java.lang.Thread;
import java.util.Collections;
import java.util.Vector;

public class Multithreading02 extends Thread {

    public  void run(){
       System.out.println("This is Thread class : ");
       try {
          for(int i=0;i<10;i++){
             System.out.print(i+" ");
             Thread.sleep(1000);

          }
              }
       catch (Exception e){
          System.out.println(e.fillInStackTrace());
       }

        Vector<Integer> v= new Vector<>();
       v.add(10);
        Collections.sort(v);
        v.get(0);

      System.out.println("This is Run 2 Method in Multithreading 2 ");
      System.out.println("Alright");
   }

   public static void main(String[] args) throws RuntimeException{
      Multithreading02 m= new Multithreading02();
         Thread th = new Thread(m);
      th.start();
//      th.start();
   }
}
