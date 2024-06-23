import java.util.Scanner;
import java.lang.String;
 class producer_Consumer_Algorithm {
    Scanner sc = new Scanner(System.in);
    int n;
    String s;

    public void Input() {

//        if(s.length()<1000){

            System.out.println("Enter An String : ");

            s=sc.nextLine();


            n=Integer.parseInt(s);

            System.out.println("Let me Check : "+(n*n));
        }

     public void Result(){
         System.out.println(n%11);
     }

     public static void main(String[] args) {

         producer_Consumer_Algorithm object =new producer_Consumer_Algorithm();

        object.Input();

        object.Result();


    }
} 