import java.util.Scanner;

public class str_to_Integer {

    int n;

    public int Input(String str) {
        n = Integer.parseInt(str);
        return n;
    }
  public  void string_slice(){
        String str="I'm Learning Java ";
        String s=str.substring(0,str.length());
      System.out.println("Substring in Given String : "+s);
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter an String for Conversion");
        str = sc.nextLine();
        str_to_Integer object = new str_to_Integer();
        System.out.println("String to Integer : " + object.Input(str));
        object.string_slice();

    }
}