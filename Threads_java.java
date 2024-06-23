import  java.lang.Thread;
import java.util.Scanner;
class Threads_java extends  Thread {
    Scanner sc=new Scanner(System.in);
    int n;
    public void run() {
        System.out.println("Enter Value of A :");
        n=sc.nextInt();

        for(int i=1;i<n;i++){
            int x=i;
            int f=0;
            for(int j=2;j<x/2;i++){
                if(j%i==0){
                    f=1;
                }
                else{
                    f=0;
                }
            }
            if(f==1){
                System.out.print(i +" ");
            }
        }
    }

    public static void main(String[] args) {
        Threads_java ob=new Threads_java();
        Thread t=new Thread(ob);
        t.start();
    }
}
