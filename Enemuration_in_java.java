import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Random;

public class Enemuration_in_java {
    int i=0,n=10;
    public  void Method() {
        enum let {
            Mayur, Om, Mahendra, Home, Satyawan, Ritk;

        }
        let c = let.Mayur;
        System.out.println("This is Value of Enumeration : "+c);
    }
    public void Randon(){
        Random ran =new Random();

        System.out.println("This is Random in : ");

        while(i<n) {
            int x = ran.nextInt(100);
            System.out.println(x);
           i++;
        }
    }

    public static void main(String[] args) {
        Enemuration_in_java java=new Enemuration_in_java();
        java.Method();
        java.Randon();
    }
}
