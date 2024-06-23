import java.util.Scanner;
import  java.lang.String;
public class String_rev {
    Scanner sc = new Scanner(System.in);

    public void Take() {
        String s,str="";
       char c;
        System.out.println("Enter an String : ");
        s=sc.nextLine();
        int n=s.length();
        for(int i=0;i<n;i++){
            c=s.charAt(i);
            str=c+str;
        }
        System.out.println("Reverse String : "+str);
    }

    public static void main(String[] args) {
        String_rev s = new String_rev();
        s.Take();
    }
}
