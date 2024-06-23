import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;

public class Wrapper_Class {
    Scanner sc= new Scanner(System.in);
    public void intWrapper() throws NumberFormatException{
        Hashtable<Integer,Integer> hash =new Hashtable<>();
        int i,n;
int c=100;
        int []a= {10,20,30,40,50};
         n=a.length;
         try {
//             Integer b = new Integer(b.intValue(c));
             System.out.println();
             throw new NumberFormatException("Occurering Number formate Exception ");
//              new RuntimeException("Runtime Exception ");
         }
         catch (Exception e){
             e.printStackTrace();
         }
        System.out.println("The Length of Array is :  "+n);
        for (int element:a){
            String str=Integer.toString(element);
            System.out.println("I am Integer :"+element);
            System.out.println( "I am String Converted "+str);
        }
    }
    public void strReverse(){
        String str="Mayur_adlak",ans=""; char t;
        System.out.println("Enter an String ");


        System.out.println("Reverse Order of String : "+ans);
    }
    public static void main(String array[]){
        Wrapper_Class object = new Wrapper_Class();
 object.strReverse();
        object.intWrapper();

        System.out.println("Let's Learn For Each Loop in Java Suprime ");
    }
}
