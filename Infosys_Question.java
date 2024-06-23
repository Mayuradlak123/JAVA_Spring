import java.util.ArrayList;
import java.util.Scanner;

public class Infosys_Question {
    Scanner sc=new Scanner(System.in);
    String str[]=new String[4];
    String digit;
    ArrayList<String> arr =new ArrayList<>();
    public int Input_Method(){
        System.out.println("Enter String ");
        int i;
        for (i=0; i<4; i++){
            str[i]=sc.nextLine();
        }
        System.out.println("Enter Digit which you want to delete: ");
        digit=sc.nextLine();
        int s,d;
        String blank="";
//        s=Integer.parseInt(str);
//        d=Integer.parseInt(digit);
        return  0;

    }

    public static void main(String[] args) {
        Infosys_Question ifq=new Infosys_Question();
        System.out.println("Return Value By Fucntion : "+ifq.Input_Method());
    }

}
