package C1.Exercises;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class E1o7 {
    public static void main(String[] args){
        Scanner readLine = new Scanner(System.in);
        int first, second;
        first = Integer.parseUnsignedInt(readLine.nextLine(), 10);
        second = Integer.parseUnsignedInt(readLine.nextLine(),10);

        int sum = first + second;
        String sumString = Integer.toUnsignedString(sum);
        int dis = first - second;
        String disString = Integer.toUnsignedString(dis);
        int mul = first * second;
        String mulString = Integer.toUnsignedString(mul);
        int div = first / second;
        String divString = Integer.toUnsignedString(div);
        int rem = first % second;
        String remString = Integer.toUnsignedString(rem);
        System.out.println("sum:" + sumString + "\ndis:" + disString);
        System.out.println("mul:" + mulString + "\nrem:" + remString);

    }
    
}
