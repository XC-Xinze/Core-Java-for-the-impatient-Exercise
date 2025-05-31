package C1.Exercises;

import java.util.Scanner;

public class E1o8 {
    public static void main(String[] args){
        Scanner readTXT = new Scanner(System.in);
        String txtContent = readTXT.nextLine();
        int times = 1;
        for (int i = 0 ; i < txtContent.length()+1; i++){
            for (int j = i + 1 ; j < txtContent.length()+1; j++){
                String temp = txtContent.substring(i,j);
                if(temp.contains(" ") || temp.isEmpty()){
                    continue;
                }
                System.out.println("No."+times +"\t|"+temp);
                times++;

            }

        }
    }
}
