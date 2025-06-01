package C2;

public class CallEmployee {
    public static void main(String[] args) {
        Employee tom = new Employee();
        tom.setName("tom");
        System.out.println(tom.getName());
        tom.setSalary(888.888);
        System.out.println(tom);//C2.Employee@15db9742
    }
    
}
