package C1.t2;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayAlgorithm {
    public static void main(String[] args){
        //Collections class provides process methods  for ArrayList
        ArrayList<String> collectionTest = new ArrayList<>();
        for (int i = 0; i < 10 ; i++){

            collectionTest.add(Integer.toString(i));
        }
        System.out.println("original: " + collectionTest);
        Collections.reverse(collectionTest);
        System.out.println("reverse: " + collectionTest);
        Collections.shuffle(collectionTest);
        System.out.println("shuffle: " + collectionTest);
        double avr = aver_Double(1,2.3,5);
        System.out.println(avr);

    }
    public static double aver_Double(double... parameter){
        //dynamic number of elements
        double avr = 0;
        int i=0;
        for (double num : parameter){
            i++;
            avr += num;
        }
        avr = avr / i;
        return avr;
    }
     
}