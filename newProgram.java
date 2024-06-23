import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class newProgram {
    Scanner sc= new Scanner(System.in);
    public void subStr(String str,int n){
        //abc
        System.out.println(str);
         while (n<0){

         }
    }
    public void getInput(){
        String str="abc";
        // abc,bac,cba,bca,acb,cab
        //
//        str=sc.nextLine();
        int start=0,end=str.length()-1;
        for (int i=start; i<=end; i++){
          subStr(str,str.length());
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        newProgram object =new newProgram();
        object.getInput();
    }
}
