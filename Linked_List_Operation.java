import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List_Operation {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
    int n, i, node, index, beg, end;

    public void add_Node() {
        System.out.println("Enter number of node: ");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            node = sc.nextInt();
            list.add(node);
        }
        System.out.println("Element of Linked List : " + list);
    }

    public void remove_Node() {
        if (list.size()>0) {
            System.out.println("Enter Index which node you want to remove: ");
            index = sc.nextInt();
            list.remove(index);
            System.out.println("Element of Linked List : " + list);
        }
        else {
            System.out.println("Linked List is Empty ");
        }
    }

    public void Insert_at_Begin() {
        System.out.println("Enter node for insert at begin: ");
        beg = sc.nextInt();
        System.out.println("Element of Linked List : " + list);
    }

    public void print_List() {
        System.out.println("Element of Linked List : " + list);
    }
    public void Multipliy(){
        
    }

    public static void main(String[] args) {
        Linked_List_Operation object = new Linked_List_Operation();
        int menu;
        Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 for Add new node \n 2 for Insert at begining \n 3 for remove\n 4 for traversing \n 5 for Stop: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    object.add_Node();
                    break;
                case 2:
                    object.Insert_at_Begin();
                    break;
                case 3:
                    object.remove_Node();
                    break;
                case 4:
                    object.print_List();
                    break;
                case 5:
                    break;
            }
        }
    }


