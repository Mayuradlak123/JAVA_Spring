import com.sun.security.auth.NTUserPrincipal;

public class getter_setter {
    private String name;
    private int roll;
    private int age;
    private String gender;
    private int Number;
    private int height;

    private String college;
    public  String getCollege(){
        return this.college;
    }
    public void setCollege(String college){
        this.college=college;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return this.roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age <= 18) {
            throw new IllegalArgumentException("Age Must be More  than 18 ");
        }
        this.age = age;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int Height) {
        this.height = height;
    }

    public int getNumber() {
        return this.Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void Display() {
        System.out.println("All Properties of Getter And Setter : ");
        System.out.println("The Value of Name is : " + this.name);
        System.out.println("The Value of Roll is : " + this.roll);
        System.out.println("YOur Height : " + this.height);
        System.out.println("Your Gender : " + this.gender);
        System.out.println("Your Number : " + this.Number);
        System.out.println("Your Age : " + this.age);
    }

    public void Check() {
        for (int i = 0; i < 10; i++) {
            if (i == 4)
                break;
            System.out.println(i);
        }
    }
}
