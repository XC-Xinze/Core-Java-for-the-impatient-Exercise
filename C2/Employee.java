package C2;

public class Employee {
    private String name;
    private double salary;
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
}
