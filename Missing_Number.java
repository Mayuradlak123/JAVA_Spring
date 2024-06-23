import java.util.Collections;
import  java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Missing_Number {
    Scanner sc= new Scanner(System.in);
    int n;
    public void Input(){
        System.out.println("Enter Size of array : ");
        n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("ENter Element of array : ");
        int i,x;
        for(i=0;i<n;i++){
            x=sc.nextInt();
            arr.add(x);
        }
        Collections.sort(arr);
//        Collections.reverse(arr);
//        System.out.println(arr);

        for(i=0;i<n;i++){

        }
    }

    public static void main(String[] args) {
        Missing_Number ms= new Missing_Number();
        ms.Input();
    }
}
