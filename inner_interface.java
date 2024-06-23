import java.util.Scanner;

 class inner_interface  {
    public interface Winner{
        void Output();
        void Display();
    }
   public String str ;
    public  int a;
    Scanner sc =new Scanner(System.in);
    public void Take(){
        System.out.println("Enter an String and one Integer : ");
        str=sc.nextLine();
        a=sc.nextInt();
        System.out.println("Your name is  : "+str);
        System.out.println("The Value of a is : "+a);

    }
    class Second {
        private String s;
        private int x;

        public void Output() {
            System.out.println("Enter Your 3rd Sem  Result : ");
            s=sc.nextLine();
            x=sc.nextInt();
            System.out.println("Your Percentage is : "+this.x);
            System.out.println("Your name is : "+this.s);
        }
    }

    public static void main(String[] args) throws RuntimeException{
        inner_interface object =new inner_interface();
        inner_interface.Second ob2=new inner_interface().new Second();
        object.Take();
        ob2.Output();
    }
}
