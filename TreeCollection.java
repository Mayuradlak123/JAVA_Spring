import java.util.TreeMap;
import java.util.TreeSet;

public class TreeCollection {
    public void Method1(){


        TreeMap<Integer,String> tree=new TreeMap<>();
        tree.put(87,"Mayur");
        tree.put(82,"Vijay");
        tree.put(83,"Ritik");
        tree.put(84,"Vishal");
        tree.put(81,"Mahendra");
        System.out.println("The Value and Key Pair : "+tree);

    }
    public void Method2(){

        TreeSet<Integer> treeSet =new TreeSet<>();

        treeSet.add(12);
        treeSet.add(19);
        treeSet.add(8);
        treeSet.add(14);
        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(16);
        System.out.println("This is Tree Set Collection : "+treeSet);
    }
    public void Method3(){
    }

    public static void main(String[] args) {
        TreeCollection object=new TreeCollection();
        object.Method1();
        object.Method2();

    }
}
