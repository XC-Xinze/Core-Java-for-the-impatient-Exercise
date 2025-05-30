package C1.temp;

import java.io.Console;
import java.util.Scanner;

public class Main {
    //String process/Split/Concate
    //test for StringBuilder
    public static void main(String[] args){
        /* */
    String a = "aaa";
    String b = "bbb";
    String c = "ccc";
    StringBuilder builder = new StringBuilder();
    Scanner reader = new Scanner(System.in);
    //for security , use Console instead of Scanner
    Console terminal = System.console();
    char[] name = terminal.readPassword("User name:");//invisible .readLine is visible
    String temp = reader.next();
    while(!temp.equals("over")){
        //equals series: equalsIgnoreCase
        //equals: compare the content
        //==    : compare the object
        builder.append(temp);
        temp = reader.next();
    }
    System.out.println(builder.toString());
    temp = builder.toString();
    String chooseLocation = temp.substring(5,10);
    System.out.println(chooseLocation);
    String[] splitStrings = temp.split("o");//split is also works for input
    int i = 0;
    while(i < splitStrings.length){
        System.out.println(splitStrings[i]);
        i++;
    }
    //null for String !=  Empty string ---> this string doesn't exist
    int order = splitStrings[1].compareTo(splitStrings[2]);
    //compare the order for dictionary order
    //positive means ahead/negetive means behind
    System.out.println(order);
    String int2String = Integer.toString(order);
    int string2Int = Integer.parseInt(int2String);
    //all comes from Integer class/ same operation from Double...etc
    //String is a **immutable** class: won't change anything original
    String blockString = """
            a;
            b;\
            c;
            """;// use '\' to avoid line break
            // text block is good for paste code

        










    }
   

}
    
