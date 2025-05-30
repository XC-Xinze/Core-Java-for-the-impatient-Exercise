package C1.t2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCopy {
     public static void main(String[] args){
        int[] a = {1,2,3,5};
        int[] aCopy = a;
        //share same space

        int[] aCopyReal = Arrays.copyOf(a, a.length);
        //real copy

        //same as ArrayList
        var b = new ArrayList<String>();
        b.add("hi");
        var bCopy = b;
        //share same space
        bCopy.set(0, "no");
        System.out.println(b);

        var bCopyReal = new ArrayList<String>(b);
        bCopyReal.set(0, "yes");
        System.out.println("b is " + b);
        System.out.println("bCopyReal is " + bCopyReal);

     }
}
