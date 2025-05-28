package C1.t1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        System.out.print("number = ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double numberDouble = number*(-1);

        System.out.printf("number = %d\n", number);
        System.out.printf("binary number = %s\n", Integer.toBinaryString(number));
        System.out.printf("base 8 = %a\n", numberDouble);
        //similar symbol in C
        //%d %o %s %a %x skip
    }
}