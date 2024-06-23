import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
public class Kadans_algo {
    Scanner sc= new Scanner(System.in);
    protected Long max_sum(int n,int arr[]){
      int  i,j,k;
      long sum=0;
        Vector<Long> v=new Vector<>();
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                sum=0;
                for (k=i; k<=j; k++){
                    sum+=arr[i];
                    v.add(sum);
                }
            }

        }
        Collections.sort(v);
        for (Long val:v){
//            System.out.print(val+" ");
        }
        int m=v.size();
        long res=v.get(m-1);
        return res;
    }
    public void Input_method(){
        int i,n;
        System.out.println("Enter Length of array : ");
        n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter Element of array : ");
        for (i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(max_sum(n,arr));
    }

    public static void main(String[] args) {
        Kadans_algo obj=new Kadans_algo();
        obj.Input_method();
    }
}
