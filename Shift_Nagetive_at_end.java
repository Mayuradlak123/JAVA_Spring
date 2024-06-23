import java.util.Scanner;
import java.util.Vector;

public class Shift_Nagetive_at_end {
    Scanner sc= new Scanner(System.in);
    public void getMethod(){
        int i,n,temp;
        System.out.println("Enter Number of Element : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        Vector<Integer> v=new Vector<>();
        Vector<Integer> vec= new Vector<>();
        System.out.println("Enter Element of array : ");
        for (i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After Shift Alternate");
        for (i=0; i<n; i++){
            if(arr[i]<0){
                vec.add(arr[i]);
            }
            else {

                v.add(arr[i]);
            }
        }
        System.out.println(v+" "+vec);
    }

    public static void main(String[] args) {
        Shift_Nagetive_at_end object = new Shift_Nagetive_at_end();
        object.getMethod();
    }
}
