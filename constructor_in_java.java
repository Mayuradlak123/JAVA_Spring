import java.util.Scanner;

public class constructor_in_java {
    int a,b,c;
    Scanner sc =new Scanner(System.in);
    constructor_in_java(){
        System.out.println("Enter The value of a: ");
        a=sc.nextInt();

        System.out.println("Enter The value of b: ");
        b=sc.nextInt();

        System.out.println("Enter The value of c: ");
        c=sc.nextInt();

        System.out.println("The Value of a: "+a);

        System.out.println("The Value of b: "+b);

        System.out.println("The Value of c: "+c);

    }

    public static void main(String[] args) {
        constructor_in_java ob =new constructor_in_java();

    }
}
