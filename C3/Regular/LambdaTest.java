package C3.Regular;
import java.util.List;
import java.util.Arrays; 
public class LambdaTest {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";
        //(String first, String second) -> first.length() + second.length();
        //this is a WRONG way to write a lambda expression
        //because it needs to be assigned to a functional interface
        //**LAMBDA expression is a functional interface instead of a type */
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
            .filter(name -> name.startsWith("A")) // 使用 Lambda 过滤
            .map(String::toUpperCase)             // 方法引用
            .forEach(System.out::println);       // 使用 Lambda 遍历输出
        
//Ze: Not go into too deep in this part
    }
}
