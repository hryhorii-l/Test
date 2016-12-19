
package ooptest;

public class Driver extends Person implements Job {

    private String schedual;
    private int salary;
        private String profession;
   

    
    public Driver(String name, String gender, int age, String schedual, String profession, int salary) {
        super(name,gender,age);        
        System.out.println("I’m a driver");
        this.schedual = schedual;
        this.salary = salary;
        this.profession = profession;
    }
     
    @Override
    public int getsalary() {
        return this.salary;
    }
    public void setsalarry (int salary){
        this.salary = salary;
    }    
    @Override
    public String getscheduel() {
        return this.schedual;
    }
    
   

    @Override
    public String getprofession() {
        return this.profession;
    }

    @Override
    public void duties() {
        System.out.println("Drive a car");
    }
    
}
