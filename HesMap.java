import java.util.HashMap;
import java.util.HashSet;

 class HesMapCollection {
    public  void Method(){
        HashMap<String,Integer> has=new HashMap<>();
        has.put("Mayur",90);
        has.put("Om",99);
        has.put("Motu",100);
        System.out.println("Here im using Itrator : ");
        System.out.println(has);
    }
    public void Method2(){

        HashSet<Integer> h=new HashSet<>();
        h.add(4);
        h.add(10);
        h.add(11);
        h.add(6);
        h.add(6);
        System.out.println("This is Hashset Element in JAVA: "+h);
            }

    public static void main(String[] args) {
        HesMapCollection ob=new HesMapCollection();
        ob.Method();
        ob.Method2();
    }
}
