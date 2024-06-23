package Com.Company;

import java.util.Scanner;

public class Inner_Class {
    class Inner{
        String s="Oriental University Indore";
        int b;
        Scanner sc =new Scanner(System.in);
        public void Inside(){
            System.out.println("ENter The Value of  b: ");
            b=sc.nextInt();
            System.out.println("The value of b : "+b);
            System.out.println("The value of String : "+s);
        }
    }
    Scanner sc =new Scanner(System.in);

    int a;
    String str="Tommorow My Examination";
    public void Example(){

        System.out.println("Enter The Value of A : ");
         a=sc.nextInt();
        System.out.println("The value of A is : "+a);
        System.out.println("The value of str : "+str);
    }

    public static void main(String[] args) {
         Inner_Class ob1=new Inner_Class();
         Inner_Class.Inner ob2=new Inner_Class().new Inner();
         ob2.Inside();
         ob1.Example();
    }
}
