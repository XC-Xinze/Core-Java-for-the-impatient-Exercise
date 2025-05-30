package C2.t1;
import java.time.DayOfWeek;
import java.time.LocalDate;
//test for time libraries
//Format output of C1.Calendar
public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now().withDayOfMonth(1);
        int month;
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        } else {
            month = date.getMonthValue();
        }

        System.out.println(" M\t T\t W\t T\t F\t S\t S");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); 
        // 1 = M 7 = S
        for (int i = 1; i < value; i++)
            System.out.print("\t");//use \t
        while (date.getMonthValue() == month) {
            System.out.printf("%4d\t", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
} 
    

