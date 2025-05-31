package C1.Exercises;
import java.util.Scanner;
public class E1o2 {
    public static void main(String[] args){
        Scanner readDegree = new Scanner(System.in);
        int degree = readDegree.nextInt();
        if (degree < 0){
            degree = -degree;
        }
        int normalizeDegree = degree % 360;
        System.out.println("%360: " + normalizeDegree);
        System.out.println("floorMod: " + floorMod(degree));

    }
    public static int floorMod(int degree){
        if (degree < 0){
            degree = -degree;
        }
        int normalizeDegree = degree % 360;
        return normalizeDegree;
    }

}
