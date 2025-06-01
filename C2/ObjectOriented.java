package C2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ObjectOriented {

    public static void main(String[] args) {
        //Object-Oriented main idea:
            //State: Program remembers the State of different object
                //C: use funciton, when function is end--> no any States remaining
                    //Any different from Structor?
            //encapsulation/ multi-state / inherited
        LocalDate date = LocalDate.of(2024, 8, 11);
        date = date.plusDays(1);
        while (date.getMonthValue() == 8) {
            System.out.print(date);
            date = date.plusDays(1);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.print("\t" + dayOfWeek + "\n");
            //methods can be chained like : date.getDayOfWeek().getValue();
        }
        //accessor: won't change the original object / mutator: change original object
        // pointer in C: can be changed/computed --- > can modify original ram
        // reference in java: only for access memory ---> it is SAFE
        


    }
}