package C4.Objects;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String Pname;
    public int Page;
    public Dog(String Pname, int Page,int symbol) {
        this.Pname = Pname;
        this.Page = Page;
    }
    public Dog clone() {
        return new Dog(this.name, this.age);
    }
    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }

    

    
}
