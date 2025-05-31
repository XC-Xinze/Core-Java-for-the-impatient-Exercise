package C1.Exercises;

import java.util.Scanner;

public class E1o4 {
    public static void main(String[] args){
        double a, b, c;
        Scanner readDouble = new Scanner(System.in);
        a = Math.nextUp(readDouble.nextDouble());
        // nextUp finds a double type number which closer to infinite
        b = Math.nextUp(readDouble.nextDouble());
        c = Math.nextUp(readDouble.nextDouble());
        if ( a < b){
            a = b;
            if (a < c){
                a = c;
            }
        }
        System.out.println(a);
    }
}
