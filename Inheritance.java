import java.util.Scanner;

class A {
    int a, b;
    Scanner sc = new Scanner(System.in);

    public void Input() {

        System.out.println("Enter a and b : ");

        a = sc.nextInt();
        b = sc.nextInt();

    }

}

class Inheritacne extends A {
    public void Print() {
        System.out.println("The value of A is  :" + a);
        System.out.println("The value of B is : " + b);

        System.out.println("This is Inheritacnce  Class : ");

    }

    public static void main(String[] args) {
        Inheritacne ob = new Inheritacne();
        ob.Input();
        ob.Print();
    }
}
