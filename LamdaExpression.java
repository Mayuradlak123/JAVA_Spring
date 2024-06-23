import java.util.ArrayList;

public class LamdaExpression{
    public void Example(){
        ArrayList<Integer> arr=  new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println("This is Lambda Expression in Java Let's see Itration ");
        arr.forEach((n)->{
            System.out.println(n);
        });
        System.out.println("Second Method of Itration ");
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static void main (String a[]){
        LamdaExpression object = new LamdaExpression();
        object.Example();
            }
}