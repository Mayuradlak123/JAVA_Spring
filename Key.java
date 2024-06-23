import java.util.Arrays;
import java.util.*;
public class Key{

    int key1 =0;

    int key2 =0;

    int key33 = 0;

    int KEY;

    int[] key3 = new int[4];
    public int findKey(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please write 1000 <= input1 <= 9999 ");

        int input1 = sc.nextInt();

        System.out.println("Please write 1000 <= input2 <= 9999 ");

        int input2 = sc.nextInt();

        System.out.println("Please write 1000 <= input3 <= 9999 ");

        int input3 = sc.nextInt();

        while(input1 >= 1000)

        {

            input1 = input1 - 1000;

            // input1 = input1;

        }

        while(input1 >= 100)

        {

            input1 = input1 - 100;

            key1 = key1 + 1;

        }

        while(input2 >= 100)

        {

            input2 = input2 - 100;

            // input2 = input2;

        }

        while(input2 >= 10)

        {

            input2 = input2 - 10;

            key2 = key2 + 1;

        }

        key3[0]=input3/1000;

        input3=input3-(1000*key3[0]);

        key3[1]=input3/100;

        input3=input3-(100*key3[1]);

        key3[2]=input3/10;

        input3=input3-(10*key3[2]);

        key3[3]=input3;

        key33 = Arrays.stream(key3).max().getAsInt();

        KEY = (key1 * key2) - key33;

//        System.out.println( key1);
//
//        System.out.println( + key2);
//
//        System.out.println( + key33);

        return KEY;


    }
    public static void main(String[] args) {
        Key ob= new Key();
        System.out.println(ob.findKey());

    }

}