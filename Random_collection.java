import java.util.Random;
import java.util.Scanner;

public class Random_collection {
    Scanner sc = new Scanner(System.in);
    int n, x,i=0;
    Random ran =new Random();

    public void Input() {
        System.out.println("Enter An Numbe for Genrate between Number: ");
        n = sc.nextInt();
        System.out.println("How Many Number you want to generate : ");
        x = sc.nextInt();
    }

    public void Output() {
      while(i<x){
          int num= ran.nextInt(n);
          System.out.print(num+" ");
          i++;
      }
        System.out.println("\n"+x+ " : Number Genrate by Random Class : ");
    }

    public static void main(String[] args) {
        Random_collection rc= new Random_collection();
        rc.Input();
        rc.Output();
    }
}