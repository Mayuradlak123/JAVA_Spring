public class copyConstructor {
    private String name="Mayur Adlak";
    private String age="20";
   public copyConstructor(String name,String age){
        System.out.println("Hello i am a Copy Constructor ");
        System.out.println("My name is Copy Constructor ");
        name=this.name;
        age=this.age;
       System.out.println("Your name is : "+name+" Your Age is : "+age);
    }
    public void function(){
        System.out.println("Hello Function this is Copy Constructor ");
        System.out.println("I'm calling inside the Constructor ");
    }
    // Creating Copy Constructor
    copyConstructor(copyConstructor object){
        System.out.println("Your name is : "+object.name);
        System.out.println("Your Age is : "+object.age);
        object.function();
    }

    public static void main(String[] args) {
        copyConstructor ob= new copyConstructor("Mayur","20");
        copyConstructor copy= new copyConstructor(ob);
    }
}
