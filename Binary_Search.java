import java.util.Scanner;

class Binary_Search {
Scanner sc= new Scanner(System.in);
    int binarySearch(int arr[], int k, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {

            // get index of mid element
            int mid = low + (high - low) / 2;

            // if element to be searched is the mid element
            if (arr[mid] == k)
                return mid;

            // if element is less than mid element
            // search only the left side of mid
            if (arr[mid] < k)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
public  void getInput(){
    int i,n,k;
    System.out.println("Enter Length of array ");
    n= sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter Element of array : ");
    for (i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter Element for search : ");
    k=sc.nextInt();
    int res=binarySearch(arr,k,0,n-1);
    if(res>0){
        System.out.println("Element found at Index : "+res);
    }
    else{
        System.out.println("Element not Found ");
    }
}
    public static void main(String args[]) {

        Binary_Search obj = new Binary_Search();
        obj.getInput();
    }
}