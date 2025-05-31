package C1.Exercises;

import java.util.Scanner;

public class E1o3 {
    public static void main(String[] args){
        int a,b,c;
        Scanner readInt = new Scanner(System.in);
        a = readInt.nextInt();
        b = readInt.nextInt();
        c = readInt.nextInt();
        if ( a < b){
            a = b;
            if ( a < c){
                a = c;
            }
        }
        System.out.println("Biggest: " + a);
        b = Math.max(b,c);
        a = Math.max(a, b);
        

        System.out.println("Biggest: " + a);
    }
}
