import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_class {
    Scanner sc= new Scanner(System.in);
    public void Function01(){
        Stream<Integer> i= Stream.of(10,20,30);
        System.out.println("The value of i is : "+i);

        }

    public static void main(String[] args) {
        Stream_class object =new Stream_class();
        object.Function01();
    }
    }