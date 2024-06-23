import java.util.ArrayList;

public class break_countinue {

    public static void Show(){
        int i;
        ArrayList<Integer> arr= new ArrayList<>();
        for(i=0;i<10;i++){
            if(i%2==0){
                arr.add(i);
            }
            else{
                continue;
            }
        }
        System.out.println("Practical of Break Countinue : "+arr);

    }

    public static void main(String[] args) {
     break_countinue ob =new break_countinue();
     ob.Show();
    }
}
