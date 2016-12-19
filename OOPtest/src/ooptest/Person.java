
package ooptest;


public class Person  {
    
    private String name;
    public String surname;
    protected int age;
    String gender;
  
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        
        System.out.println("Person:" + name + " " + " " + gender + " " + age);
    }    
    public String getname() {
        return this.name;
    }
    public void setname (String name){
        this.name = name;
    }    
    public int getage() {
        return this.age;
    }
    public void setage (int age){
        this.age = age;
    }    
    public String getgender() {
        return this.gender;
    }
    public void setgender(String gender){
        this.gender = gender;
    }
    
}
