package C4.Inherit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animals dog = new Dog();
        dog.setName("Buddy");
        dog.setAge(5);
        dog.setColor("Brown");
        System.out.println("Dog's Name: " + dog.getName());
        System.out.println("Dog's Age: " + dog.getAge());
        System.out.println("Dog's Color: " + dog.getColor());
        dog.eat(); // Calling the inherited method from Animals class
        Animals cat = new Cat();
        cat.setName("Whiskers");
        cat.setAge(3);
        cat.setColor("White");
        System.out.println("Cat's Name: " + cat.getName());
        System.out.println("Cat's Age: " + cat.getAge());
        System.out.println("Cat's Color: " + cat.getColor());
        cat.eat(); //using overidded method from Cat class

        var friends = new ArrayList<String>();
       }   
}
