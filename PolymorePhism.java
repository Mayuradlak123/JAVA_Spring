class Compile_time {
    public void Overloading(int a, int b, int c, int d) {
        System.out.println("The value of A is :" + a);
        System.out.println("The value of B is :" + b);
        System.out.println("The value of C is :" + c);
        System.out.println("The value of D is :" + d);
    }

    public void Overloading(String name) {
        System.out.println("Your Given name is : " + name);
    }
}

class PolymorePhism {
    public void Display() {
        System.out.println("This is Base Class I maean Fisrt Class of Our Java Program : ");
        System.out.println("You need to may more Improvmenet : ");

    }
}

class Base extends PolymorePhism {
    @Override
    public void Display() {
        super.Display();
        System.out.println("This is Main Class of Java Program it mean Base class ");
        System.out.println("Today You can't Sleep Before Complete Overriding  ");

    }

    public static void main(String a[]) {
        try {
            Base object = new Base();
            Compile_time obj = new Compile_time();
            obj.Overloading(10, 20, 30, 40);
            object.Display();
            obj.Overloading("Mayur Adlak");
        } catch (Exception e) {
            System.out.println("Something Went Wrong ");
        }
    }
}