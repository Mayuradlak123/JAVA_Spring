import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Runnable;

public class java_Multithreading extends Thread{
    Scanner sc= new Scanner(System.in);
//    Thread tr= new Thread();
    public  void run(){
        int n,i,temp;
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Enter Number of element : ");
        n= sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        System.out.println("Enter Number of Element : ");
        for (i=0; i<n; i++){
            temp=sc.nextInt();
            arr.add(temp);
        }

        System.out.println("Element After 2 second : ");
        System.out.println(arr);

    }
public void Builder(){
        StringBuffer str =new StringBuffer();
    System.out.println("Enter String ");

        int s=str.length();
    System.out.println("Size of String buffer : "+s);
    }

    public static void main(String[] args) {
        java_Multithreading ob= new java_Multithreading();
        Thread tr=new Thread(ob);
        tr.start();
        ob.Builder();
    }

}
