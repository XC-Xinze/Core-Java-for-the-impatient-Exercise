package C3.RegularImportant;

public interface StaticInterface {
    static StaticInterface createInstance(int x) {
        return new StaticClass(x) ;
    }
    void display();
    void printP();
    default void disconnect(){
        System.out.println("Disconnect every port..");
    }
    //default methods can be overridden in implementing classes
    //I don't need to implement this method in the implementing class`
}
