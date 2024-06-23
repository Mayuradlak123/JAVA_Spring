import java.util.InputMismatchException;
import java.util.Scanner;

interface  Hidden{
    abstract void Display();
   abstract void Show();
    abstract void  Hide();
    abstract  void WPS();
    abstract void AWS();
}
class Test_Prepration implements  Hidden{
int a,b,c,d,e;
Scanner sc= new Scanner(System.in);
String str1,str2,str3,str4,str5;
    @Override
    public void Display() throws InputMismatchException {

        System.out.println("\nDisplay Method In Hidden Interface ");
        System.out.println("Enter One String and one one Integer : ");
        str1=sc.nextLine();
        a=sc.nextInt();
        System.out.println("The value of A is "+a);
        System.out.println("The value of str1 is: "+str1);
    }

    @Override
    public void Show() throws InputMismatchException {

        System.out.println("\nShow Method In Hidden Interface ");
        System.out.println("Enter One String and one one Integer : ");
        str2=sc.nextLine();
        b=sc.nextInt();
        System.out.println("The value of A is "+b);
        System.out.println("The value of str1 is: "+str2);

    }

    @Override
    public void Hide()throws InputMismatchException  {

        System.out.println("\nHide  Method In Hidden Interface ");
        System.out.println("Enter One String and one one Integer : ");
        str3=sc.nextLine();
        c=sc.nextInt();
        System.out.println("The value of A is "+c);
        System.out.println("The value of str1 is: "+str3);

    }

    @Override
    public void WPS()throws InputMismatchException  {

        System.out.println("\nWPS Method In Hidden Interface ");
        System.out.println("Enter One String and one one Integer : ");
        str4=sc.nextLine();
        d=sc.nextInt();
        System.out.println("The value of A is "+d);
        System.out.println("The value of str1 is: "+str4);

    }

    @Override
    public void AWS() throws InputMismatchException {

        System.out.println("\nDisplay Method In Hidden Interface ");
        System.out.println("Enter One String and one one Integer : ");
        str5=sc.nextLine();
        e=sc.nextInt();
        System.out.println("The value of A is "+e);
        System.out.println("The value of str1 is: "+str5);

    }

    public static void main(String[] args) throws InputMismatchException {
        Test_Prepration tp =new Test_Prepration();
        tp.Display();
        tp.Hide();
        tp.WPS();
        tp.AWS();
        tp.Show();
    }
}