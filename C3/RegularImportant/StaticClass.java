package C3.RegularImportant;

public class StaticClass implements StaticInterface {
    // StaticClass implements the StaticInterface
    // and provides the implementation of the createInstance method
    public void display() {
        System.out.println("StaticClass instance created.");
    }
    private int p;
    public StaticClass(int x) {
        this.p = x;
    }
    public void printP() {
        System.out.println("Value of p: " + p);
    }
}
