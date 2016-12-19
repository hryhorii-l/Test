
package ooptest;


public class Student extends Person implements Job {

    private String profession;
    private String schedual;
    private int salary;

    public Student(String name, String gender, int age, String schedual, String profession) {
        super(name, gender, age);
        System.out.println("I’m a student");
        this.schedual = schedual;
        this.profession = profession;
    }

     @Override
    public int getsalary() {
        return this.salary;
    }
    public void setsalarry (int salary){
        if(salary == 0){
            System.out.println("I do not have scholarships");
        }
        else {
            this.salary = salary;
            System.out.println("my scholarships = " + salary);
        }
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
        System.out.println("Studing");
    }
    
    public void vocation() {
        this.schedual =  "sleep all day";
    }
    
}

