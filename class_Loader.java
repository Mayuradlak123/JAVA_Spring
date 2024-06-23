
public class class_Loader {
    public static void main(String[] args) {
        System.out.println("Class Loader in Java Virtual Machine : ");
        System.out.println(class_Loader.class.getClassLoader());
        System.out.println(String.class.getClassLoader());
        System.out.println(class_Loader.class.getDeclaredClasses());
        System.out.println(class_Loader.class.getClasses());
        System.out.println("class loader : "+class_Loader.class.getPackage());
    }
}
