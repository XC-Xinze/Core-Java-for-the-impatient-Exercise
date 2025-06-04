package C4.Inherit;

public class Cat extends Animals {
    // Cat class inherits from Animals class
    // and can have additional properties or methods specific to cats

    public void meow() {
        System.out.println(getName() + " says Meow!");
    }

    @Override//overrride can't be used with private methods
    //can't change the return type of the method
    //cant change the parameter type of the method
    public void eat() {
        System.out.println(getName() + " is eating fish.");
    }
    
}
