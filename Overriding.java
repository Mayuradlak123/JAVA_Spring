import java.util.Scanner;

public class Overriding {
    int a,b;
    Scanner sc=new Scanner(System.in);
    public void Extension(){
        System.out.println("Enter Two Integetr: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("The value of a is : "+a);
        System.out.println("The Value of b is : "+b);
    }
//    @Override
//    public  void Extension(){

    }

