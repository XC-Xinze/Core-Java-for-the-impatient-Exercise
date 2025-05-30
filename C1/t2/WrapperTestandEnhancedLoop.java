package C1.t2;

import java.util.ArrayList;

public class WrapperTestandEnhancedLoop {
    public static void main(String[] args){
        //ArrayList can't use primitive type as parameter-->int long float double boolean .
        //illegal: ArrayList<int>
        //Wrapper class is preparation for primistive type when using it as a type parameter
        var numbers = new ArrayList<Integer>();
        numbers.add(0,42);
        int first = numbers.get(0);//unbox 
        //.get() return a object not a value
        System.out.println(first);
        int sum = 0;
        for (int n : numbers){ //traverse all elements in numbers--->to n
            System.out.println(n);
        }

    }
}
