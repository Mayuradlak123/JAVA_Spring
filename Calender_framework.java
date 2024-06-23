import java.util.*;


class Calender_framework extends Leader {
     public static void main(String[] args) {
         Calendar cal= Calendar.getInstance();
         System.out.println("Today's Right now Time in Hour  : 0"+cal.get(Calendar.HOUR)+":0"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
        Calender_framework cf= new Calender_framework();
        cf.printMethod();
        cf.printMethod2();
          }
}