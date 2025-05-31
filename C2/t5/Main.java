package C2.t5;

import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args){
        final Point point = new Point(3, 4).translate(4, 4).scale(0.5);
        //RandomGenerator randomx =  RandomGenerator.getDefault();
        System.out.print(point);
        //final Point point2 = new Point(randomx.nextInt(), randomx.nextInt()).translate(randomx.nextInt(), randomx.nextInt()).scale(0.5);
        //System.out.print(point2);
    }   
}

