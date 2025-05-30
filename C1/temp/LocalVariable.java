package C1.temp;

import java.util.Scanner;

public class LocalVariable {
    public static void main(String[] args){//args! works for whole main method
        //LocalVariable--> Decl in method/method parameter
            //works in the block of where Decl happen(in while(),every loop is a copy)
        //same as TypeConstrains in Programming Language-->[E]
        //scope
        System.out.println(args);
        Scanner stopSign = new Scanner(System.in);//only for stop code
        /* 
        while (true) {
            int x = 1;
            if (x == 10) {
                break;
            }
            x++; //this will only return 2 because x is a copy in each loop with inital value 1
            System.out.println(x);
        }
        int x = 15;
        System.out.println(x);*/
    }
}
