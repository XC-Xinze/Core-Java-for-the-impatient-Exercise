package C2.t2t3;

public class CallEmployee {
    public static void main(String[] args) {
        Employee tom = new Employee(10001);
        tom.setName("tom");
        System.out.println(tom.getName());
        tom.setSalary(888.888);
        System.out.println(tom);
        //C2.Employee@15db9742
            //Transfer method as a parameter will only transfer the reference
        EmpolyeeParameter printMe = new EmpolyeeParameter();
        printMe.printEmployee(tom);
        System.out.println("Manager gives a fixed amount:");
        printMe.setWorkerSalary(tom, 860);
        System.out.println(tom.getSalary());//orginal one instance 'tom' has been changed
        //most interesting thing is: even is calling by reference, in fact, calling by value.

        var thisTest = new Employee(24.4,10002);
        printMe.printEmployee(thisTest);
        System.out.println(thisTest.getID());

    }
    
}
