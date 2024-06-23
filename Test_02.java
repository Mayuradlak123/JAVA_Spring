import java.util.Scanner;

class Test02{
    Scanner sc= new Scanner(System.in);
    int d,e;
    Test02(){
        System.out.println("Enter The value of d and e: ");
        d=sc.nextInt();
        e=sc.nextInt();

    }
    Test02 get(){

        return  this;
    }
    void Show(){

        System.out.println("The value of d: "+d);
        System.out.println("The value of e: "+e);
    }

    public static void main(String[] args) {
        Test02 ob =new Test02();
        ob.get().Show();
    }
}