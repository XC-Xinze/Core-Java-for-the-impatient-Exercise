package C4.Inherit;

public class Animals {
    private String name;//animal's name
    private int age;//animal's age
    private String color;//animal's color
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;}
    public void setAge(int age) {
        this.age = age; 
    }
    public int getAge() {
        return age;}
    public void setColor(String color) {
        this.color = color;}
    public String getColor() {
        return color;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
}
