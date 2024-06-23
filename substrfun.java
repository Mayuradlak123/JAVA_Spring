import java.util.Scanner;
import java.util.Vector;
import java.lang.Thread;
public class substrfun {
    Scanner sc= new Scanner(System.in);
    String text,pattern;
    int i,n,m;

    public void input(){
        System.out.println("Enter Text : ");
        text=sc.nextLine();
        System.out.println("Enter Pattern for searching : ");
        pattern=sc.nextLine();
        Vector<Integer> v= new Vector<>();
        n=text.length();
        m=pattern.length();
        for (i=0; i<n; i++){
                if (text.substring(i, m) == pattern) {
                    v.add(i);
                }
        }
        if (v.size()<0){
            v.add(-1);
        }
        System.out.println("All Find Pattern Index : "+v);
    }

    public static void main(String[] args) {
        substrfun object =new substrfun();
        object.input();
    }
}
