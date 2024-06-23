import java.util.Scanner;

public class new_java_class{
    Scanner sc= new Scanner(System.in);
    int n,i;
    int arr[]=new int[100];
    public void Input() {
        System.out.println("Enter a number ritik : ");
        n = sc.nextInt();
        System.out.println("Enter Element of array : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start=0,end=n,mid;
        int k,f=0;
        System.out.println("Enter Element for Seaqrching : ");
        k=sc.nextInt();

        mid=start+end/2;
        for (i=0;i<n ;i++){
            if(arr[mid]==k){
                System.out.println("Element found at index: "+i);
                break;
            }
            else if(arr[mid]<k){
                start=mid+1;

            } else if (arr[mid]>k) {
                end=mid-1;
            }
            else{
                f=1;
            }
        }
    }

    public static void main(String[] args) {
        new_java_class ob =new new_java_class();
        ob.Input();

    }
}