import java.util.Scanner;

public class integer_string {
    Scanner sc= new Scanner(System.in);
    integer_string (){
        int a;
        String str;
        System.out.println("Enter value of a: ");
        a= sc.nextInt();
        System.out.println("Enter String for check : ");
        str=sc.nextLine();
        System.out.println("Sum of a and str is : "+(a+str));
    }
    static {
        System.out.println("This is Static Block ");
    }

    public static void main(String[] args) {
//        new integer_string();
    }
}
