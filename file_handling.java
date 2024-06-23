import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class file_handling  {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome in JDBC");
        while(true){
            System.out.println("Press 1 for Add student : ");
            System.out.println("Press 2 for Delete  Student : ");
            System.out.println("Press 3 for Displauy: ");
            System.out.println("Press 4 for Exit: ");
            int c=Integer.parseInt(bf.readLine());
            if(c==1){
                System.out.println("Add new Student : ");
            }
            else if(c==2){
                System.out.println("Delete Student Data: ");
            }
            else if(c==3){
                System.out.println("Display Student data");
            }
            else if(c==4){
                System.out.println("Thanks for using my Application: ");
            }
            else{
                System.out.println("Wrong Choice Please Try Again ");
            }
        }
    }
}