import java.util.Scanner;

public class Method_Overloading {
    Scanner sc= new Scanner(System.in);
    public  void Method(int n,int m){
        System.out.println("The value of N is : "+n);
        System.out.println("The value of M is : "+m);

    }
    public String Method(double a,double b,double c){
        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is : "+b);
        System.out.println("Value of c is "+c);
        String str= String.valueOf(a+b+c);
        return str;
    }

    public static void main(String[] args) {
        Method_Overloading object = new Method_Overloading();
        object.Method(10,20);
        System.out.println(object.Method(134.564,98.78,123.567));

    }
}
