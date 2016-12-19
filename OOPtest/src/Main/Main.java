
package Main;
import ooptest.*;

public class Main {
public static void main(String[] args){
    Driver dr = new Driver("Gohn","fmale",29,"24/7","driver",5000);
    dr.duties();
    Student st = new Student("Hanna","male",19,"5/6","student");
    st.vocation();
    System.out.println(st.getprofession() + " " + st.getscheduel());
    st.setsalarry(10);
    
    
    Person pr = new Person("Karl","fmale",30);
    System.out.println(pr.surname = "Svilkin");
}   
}
