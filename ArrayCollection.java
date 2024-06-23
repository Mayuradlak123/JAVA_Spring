import java.lang.RuntimeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayCollection {
    Scanner sc=new Scanner(System.in);
    public  void  forString(){
        ArrayList<String > arr =new ArrayList<String>();
        arr.add("Mayur");
        arr.add("Om");
        arr.add("Motu");
        System.out.println("This Collection only for String ");
        System.out.println("The size of String data type : "+arr.size());
      //  System.out.println(arr);
        int i;
        int n=arr.size();
//        Itration using for loop of ArrayList
        for(i=0;i<n;i++){
            System.out.println(arr.get(i));
        }
        System.out.println(arr.isEmpty());
    }
    public  void forInteger(){
        ArrayList <Integer> arr2 =new ArrayList<Integer>();
        arr2.add(10);
        arr2.add(13);
        arr2.add(14);
        arr2.add(11);
        arr2.add(17);
        arr2.add(20);
        arr2.add(50);
        arr2.add(18);
        arr2.add(19);
        System.out.println("This Collection is for Integer ");
        System.out.println("The size of arr2 :"+arr2.size());
        System.out.println(arr2);

    }
    public  void forFloat(){
        ArrayList<Double> arr3=new ArrayList<>();
        arr3.add(10.11);
        arr3.add(11.89);
        arr3.add(12.9);
        System.out.println("Enter index number for remove: ");
       int  number=sc.nextInt();
        arr3.add(11.5);
        arr3.add(10.99);
        arr3.add(13.7);
        arr3.add(10.6);
        arr3.add(10.8);
        arr3.remove(number);
        System.out.println("This Collection only for Double : ");
        System.out.println("Size of Double data type : "+arr3.size());
        System.out.println(arr3);
        arr3.clear();
        System.out.println("Here im using clear method for delete all element : ");
        System.out.println("Using Clear function i cleared all element: ");
    }
    public  void SimpleArray(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array: ");
      int no=sc.nextByte();
        int arr5[]=new int[no];
        System.out.println("Enter element of array : ");
        for(int i=0;i<no;i++){
            arr5[i]=sc.nextInt();
        }
//        System.out.println(arr5.get(i));
        System.out.println(arr5.length);


    }
    public static void main(String[] args)throws RuntimeException {
        ArrayCollection a=new ArrayCollection();
        a.SimpleArray();
        a.forString();
        a.forInteger();
        a.forFloat();
    }
}
