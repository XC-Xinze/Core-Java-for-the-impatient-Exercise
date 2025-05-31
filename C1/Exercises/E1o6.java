package C1.Exercises;

import java.math.BigInteger;

public class E1o6 {
    public static void main(String[] args){
// skip E1o5: lose accuracy
        BigInteger i = BigInteger.TWO;
        System.out.println(i);
        BigInteger bigInt = BigInteger.ONE;
        int time = 1;
        while(time < 1001){
            bigInt = bigInt.multiply(i);
            i = i.add(BigInteger.ONE);
            time++ ;
        }
        System.out.println(bigInt);
         
    }
}
