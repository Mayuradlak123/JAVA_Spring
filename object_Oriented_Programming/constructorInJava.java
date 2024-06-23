package object_Oriented_Programming;

import java.util.Scanner;

public class constructorInJava {
    Scanner sc =new Scanner(System.in);
    double age=61.56;
    int rollNo=49;
    String clg="OIST";
    synchronized public  void getValue(){
        System.out.println("Enter Your Name ");
        String name =sc.next();
        System.out.println("Your Name is : "+name);
    }
  constructorInJava(){
      System.out.println("I am Cunstructor  ");
  }
  constructorInJava(int id){
  // Parameterized Constructor
      System.out.println("Your Used id is : "+id);
  }
 synchronized public void copyConstructor(){
      System.out.println("This is Copy Constructor ");
  }
 synchronized public void showDetails(constructorInJava object){
      System.out.println("Your Roll Number is : "+this.rollNo);
      System.out.println("Your Age is : "+this.age);
      System.out.println("Your College : "+this.clg);
      object.getValue();
  object.copyConstructor();
  }

    public static void main(String[] args) {
constructorInJava object= new constructorInJava();
new constructorInJava(94);
  object.showDetails(object);
    }
}
