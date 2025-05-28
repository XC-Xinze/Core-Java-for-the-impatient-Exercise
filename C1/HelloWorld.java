package C1;
import java.util.random.RandomGenerator;

public class HelloWorld {
    public static void main(String[] args){ 
        System.out.println("hello");
        for (int i = 0 ; i<10 ; i++){//same as C
            System.out.println("tddd".length());
            //System.out is a instance of class PrintStream
            //Random is a class for generating random number
            
            RandomGenerator generator = RandomGenerator.getDefault();
            System.out.println(generator.nextInt());
        }
    }
    
}
