import java.io.IOException;
import  java.lang.Runnable;
import java.util.Scanner;

class Threads_in_Java implements  Runnable {
     Scanner sc= new Scanner(System.in);
     int n,i,sum=0;
        @Override
        public void run() throws  RuntimeException {
            System.out.println("Enter Number of N :  ");
            n = sc.nextInt();
            System.out.println("Sum of natural NUmber : ");
            try {
                for (i = 1; i <= n; i++) {
                    sum += i;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(sum);
        }
    public static void main(String[] args) {
        Threads_in_Java ob=new Threads_in_Java();
        Thread t=new Thread(ob);
        t.start();
    }
}


