package C3.RegularImportant;
// what is factory method???
public class StaticMethod {
    //factory method is a static method that returns an instance of a class
    public static void main(String[] args) {
        StaticInterface facotryInstance = StaticInterface.createInstance(10);
        System.out.println("Factory method called to create an instance.");
        facotryInstance.display();
        facotryInstance.printP();
        facotryInstance.disconnect();//disconnect is not defined in StaticClass, but it is defined in StaticInterface
    }
}
