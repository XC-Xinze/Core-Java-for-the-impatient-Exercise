package C5.Exceptions;

import java.util.random.RandomGenerator;

public class RandomTest {
    public int getRandomInt(int a, int b) {
            // Validate the input arguments
        if (a < 0 || b < 0) {
                throw new IllegalArgumentException("Arguments must be non-negative");
            }
        else{
            try{
                if (a > b) {
                    throw new OwnException("The first argument must be less than or equal to the second argument");
                }
            }
            catch (OwnException e) {
                e.getOwnMessage();
                System.out.println(e.getMessage());
        } 
            finally {
                System.out.println("Exiting the method getRandomInt");
                return 0;
            }
            // else{
            //     RandomGenerator random = RandomGenerator.getDefault();
            //     int p = random.nextInt(a, b + 1);
            //     System.out.println("Random number generated: " + p);
            //     return p;
            // }  
 //   return 0;
    }
}
}
