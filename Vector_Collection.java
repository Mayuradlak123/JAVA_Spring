import java.util.Vector;
import java.lang.RuntimeException;

class  Vector_Collection extends  ArrayCollection{
    public void Method1(){
        Vector <Integer> v=new Vector<>();
        v.add(10);
        v.add(22);
        v.add(7);
//        int i=0;
//        System.out.println(v);
//        while (v.isEmpty()) {
//            System.out.println(v.get(i));
//            i++;
//        }
        System.out.println("Itration Using For each loop: ");
        for(Integer i: v){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Vector_Collection ob=new Vector_Collection();
        ob.Method1();
    }
}