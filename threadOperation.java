public class threadOperation {

    public static void main(String[] args) {
//        In this Program i'm Printing Name of Thread  and Check
//         Which Thread Currently Running
//         for our Main Method
//        Let's See
//         Alright

        System.out.println("Program is Started : ");

        int x=90,y=10;

        System.out.println("Addition of Given Number: "+(x+y));

        System.out.println("Please Wait i used Sleep Method : ");

        try {

            Thread t = Thread.currentThread();

            String s = t.getName();

           Thread.sleep(5000);
            System.out.println("Current Thread is : " + t);

            System.out.println("This is ID of Current running Thread : ");

            System.out.println(t.getId());

        }
        catch(Exception e){}

        System.out.println("Here Program Terminated : ");
    }
}
