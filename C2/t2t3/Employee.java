package C2.t2t3;

public class Employee {
    private String name;
    private double salary;
    private final int userID;//'final' when created and initialized, can't modify this value anymore
    // private --> only methods in same class can access it.

    public void raiseSalary(double raiseByPercent){
        double raiseAmount = raiseByPercent/100 * salary;
//don't we need the keyword 'this'?
        //automated potentially using it by java
        salary = raiseAmount + salary;
    }
    public String getName(){//anyone can access public method
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
// method without 'static'---> instance method
// method with 'static' ---> static method
        return this.salary;
    }
    public int getID(){

        return this.userID;
    }
    public void setID(int ID){
        //this.userID = ID;
//test for if we can modify 'final' variable
//answer is NO.
    }
    //Constructor!
    public Employee(String name, double salary,int ID){
        this.userID = ID;
        this.name = name;
        this.salary = salary;
    }
    //Constructor 2!
    public Employee(String name,int ID){
        this.userID = ID;
        this.name = name;
        this.salary = 0;//default --> 0
    }
    //constructor 3!
    public Employee(double salary,int ID){
        this("default", salary,ID);//'this' here is not a reference. it is a method.
    }
    public Employee(int ID){
        this.userID = ID;
    }
}
