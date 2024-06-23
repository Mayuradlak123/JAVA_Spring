import java.util.Scanner;

public class typecasting {
 Scanner sc= new Scanner(System.in);
 int num=10;
   public  void cast(){
 String str;
 int a;
 System.out.println("Enter an String for convert : ");
       str=sc.nextLine();
       System.out.println("Enter an int for Convert into float : ");
       a= sc.nextInt();
       double dob=a;
       System.out.println("This is Double Number : "+dob);
       System.out.println("Uppercase Conversion : "+this.num);

   }

    public static void main(String[] args) {
        typecasting ob= new typecasting();
        ob.cast();
        System.out.println("This is Ending point of Program : ");
    }
}
