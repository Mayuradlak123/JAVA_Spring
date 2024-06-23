import java.util.Scanner;

interface  Base0{
   abstract void Method01();

}
class Base1{
    Scanner sc= new Scanner(System.in);
    int a=10,b;
    public void Take(){
        String str;
        System.out.println("Enter Value of String ");
        str= sc.nextLine();
        System.out.println("Character at Given Index : "+str.charAt(1));
        System.out.println(" After Replace with O "+str.replace("a","O"));
        System.out.println("Using This Keyword Access Value of A  "+this.a);
        System.out.println("We can Change value of B is : ");
        this.b=sc.nextInt();
        System.out.println("After Taken Value of B is : "+this.b);
    }
}
class ObjectsLearning extends Base1 {

    ObjectsLearning(){
        System.out.println("Constructor Is Running First in Our Program ");
    }
    public  void Get(){

        System.out.println("Here Value of a is : "+a);
        System.out.println("Value of B is Here : "+b);
    }
    static { // Before Run Constructor Static Block is Executed
        System.out.println("Static Block Let's See Which One is Running Firstly ");
    }
    public static void main(String[] args) {
         ObjectsLearning objcet= new ObjectsLearning();
        objcet.Take();
        objcet.Get();
    }
}