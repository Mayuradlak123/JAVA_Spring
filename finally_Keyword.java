import java.util.Scanner;

class finally_Keyword  {
Scanner sc= new Scanner(System.in);
    int a,b;
 public  void Input(){

    try{
        System.out.println("Enter Value of a : ");
        a=sc.nextShort();
    }
    catch (Exception e){
        System.out.println(e);
    }
    finally {
        System.out.println("Enter value of b :");
        b=sc.nextInt();
    }
}
public  void Output(){
    System.out.println("The value of A is : "+(this.a));
    System.out.println("The value of B is : "+(this.b));
}
    public static void main(String[] args) {

        finally_Keyword ob= new finally_Keyword();
        ob.Input();
        ob.Output();
    }
}
