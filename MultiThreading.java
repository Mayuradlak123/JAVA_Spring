public class MultiThreading extends  Thread{
    public void run() {
        for(int i=0;i<11;i++){
            try {
                Thread.sleep(1000);
                System.out.println("The value of i is : " + i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("This is Part of Firts Thread ");

        for(int i=10;i<20;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        MultiThreading ob=new MultiThreading();

    }
}
