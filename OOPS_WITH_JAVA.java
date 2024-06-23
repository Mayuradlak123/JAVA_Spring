import java.lang.management.PlatformManagedObject;
import java.util.Random;
import java.util.Scanner;
interface  object_oriented{
    void Input_Method();
    void OutPut_method();
    void Show_Method();

}
 class concept {
    Scanner sc=new Scanner(System.in);
    public void Method01(){
        System.out.println("Concept of Overriding ");
        System.out.println("Let's Start with Factorial : ");
        int n,fac=1,i;
        System.out.println("Enter Number for find factorial ");
        n=sc.nextInt();
        for (i=1; i<=n; i++){
           fac+=i;
        }
        System.out.println("Factorial of Given Number : "+fac);
    }
}
class new_Class extends concept{
    public void Method01(){
        System.out.println("This is Concept class in java : ");
        System.out.println("Extended by new class in in method ");
    }
}
 class OOPS_WITH_JAVA implements object_oriented{

    Scanner sc=new Scanner(System.in);
    public  OOPS_WITH_JAVA(int para,int para1){
        String str;
        System.out.println("Parameter 01 : is "+para);
        System.out.println("Parameter 02 : is "+para1);
        System.out.println("Enter an String in Constructor : ");
        str=sc.nextLine();
        System.out.println("Uppercase Converion: "+str.toLowerCase());
        System.out.println("Lower Case Conversion : "+str.toUpperCase());
        System.out.println("Char At Fucntion : "+str.charAt(2));

    }
    @Override
    public void Input_Method(){
        System.out.println("This is Method Declear inside of Interface: ");
        int n,ran,i;
        System.out.println("Enter Number of Element you want ");
        n=sc.nextInt();
        Random random=new Random();
        for (i=0; i<n; i++){
            ran=random.nextInt(n);
            System.out.print(ran+" ");
        }
    }
     @Override
     public void OutPut_method() {
         System.out.println("This is out put method ");
         System.out.println("public decleration in program ");
     }

     @Override
     public void Show_Method() {
         System.out.println("Showing Data ");
     }

     public  String Method01(int i){
    System.out.println("Here I'm Implementing Method Overloading : ");
    String str,str1;
    System.out.println("Enter Both valeu of String : ");
    str=sc.nextLine();
    str1=sc.nextLine();
    System.out.println("Concatination of string : ");
    return str.concat(str1);
}
public void Method01(){
    System.out.println("No return type ");
}

     public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
        System.out.println("Constructor calling here : ");
        int para,para1;
        System.out.println("Enter Parameter  :");
para=sc.nextInt();
        System.out.println("Enter Second Parameter : ");
        para1=sc.nextInt();
        OOPS_WITH_JAVA object =new OOPS_WITH_JAVA(para,para1);
//object.Input_Method();
//object.OutPut_method();
//object.Show_Method();
//object.Input_Method();
         System.out.println("Return value By Fucntion : "+object.Method01(10));
    object.Method01();
    concept ob=new concept();
    new_Class nc=new new_Class();
    ob.Method01();
         nc.Method01();
    }
}
