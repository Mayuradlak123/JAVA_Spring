import java.util.LinkedList;
import  java.util.Scanner;
import  java.lang.*;
public class Linked_List_Collection {
    public  void Method(){
        LinkedList l=new LinkedList();
        l.add(100);
        l.add("Mayur");
        l.add("Om");
        l.add(89.6);
        System.out.println("I'm using here Linked List Collection: ");
        int i,n=l.size();
        for (i=0;i<n;i++){
            System.out.println(l.get(i));
        }
        System.out.println("Here i created a Linked List and itrate it : ");
        System.out.println("Alright: ");
    }
    public void Method2(){
        LinkedList<Integer> list2=new LinkedList<Integer>();
        list2.add(88);
        list2.add(34);
        list2.add(21);
        list2.add(42);
        list2.add(98);
        System.out.println("Random Access: "+list2.get(3));
        System.out.println("Size of Linkedlist :"+list2.size());

        System.out.println("This all Integer : "+list2);
    }
//    }

    public static void main(String[] args) {
        Linked_List_Collection ob=new Linked_List_Collection();
        ob.Method();
//        ob.addNode();
        ob.Method2();
    }
}
