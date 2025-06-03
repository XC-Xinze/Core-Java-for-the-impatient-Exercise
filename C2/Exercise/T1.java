package C2.Exercise;
import java.time.DayOfWeek;
import java.time.LocalDate;
//test for time libraries
//Format output of C1.Calendar
public class T1 {
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

        date = date.plusMonths(2);
        month = date.getMonthValue();
        System.out.println(date + "  " + month);
        System.out.println(" SUN\t MON\t TUE\t WED\t THU\t FRI\t SAT");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); 
        System.out.println("value of weekday:" + value);;
// 1 = M 7 = S
        if ( value == 7){
            while (date.getMonthValue() == month) {
               System.out.printf("%4d\t",date.getDayOfMonth());
               date = date.plusDays(1);
               if(date.getDayOfWeek().getValue() == 7)
                    System.out.println();
            }
        }
        else{
        for (int i = 1; i < value+1; i++)
            System.out.print("\t");//use \t
        while (date.getMonthValue() == month) {
            System.out.printf("%4d\t", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7)
                System.out.println();
        }
        }
       if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
} 
    

