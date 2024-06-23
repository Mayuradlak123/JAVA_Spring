import java.util.Scanner;
import java.lang.Thread;
 class First_thread implements Runnable{

Scanner sc= new Scanner(System.in);
     public void run() {
         int i;
         for (i = 1; i < 10; i++) {
             try {
                 Thread.sleep(1000);
                 System.out.println("First Thread " + i);
             }
             catch (Exception e){
                 e.printStackTrace();
             }
         }
     }
}
class deamonThread implements Runnable{
     synchronized public void run(){
         int j;
         for (j=0; j<10; j++){
             try {
                 Thread.sleep(1000);
                 System.out.println("Second Thread " + j);
             }
             catch (Exception e){
                 e.printStackTrace();
             }
         }
     }
    public static void main(String[] args) {
      First_thread ob1=new First_thread();
      deamonThread ob2= new deamonThread();
      Thread tr1=new Thread(ob1);
      Thread tr2= new Thread(ob2);
      try {

          tr1.join();
          tr1.start();
          tr2.start();
          tr2.join();
          System.out.println("Some Method of thread and it's Implemantation");
          tr1.setName("Mayur Adlak");
          System.out.println("Status of Thread 2: "+tr2.getState());
          System.out.println("Status of Thread 1 "+tr1.getState());
          System.out.println("Get Priority Method of Thread: "+tr2.getPriority());
          System.out.println();
          // isDaemon method is use for Check is Given Thread is Daemon or not is return true or false
          System.out.println("Checking Thread is Daemon or not "+tr1.isDaemon());
          System.out.println("This Method Return String of Thread Name : "+tr1.getName()+" \n: And Second Thread in Program is: "+tr2.getName());
      }
      catch (Exception e){
          e.printStackTrace();
      }
    }
}
