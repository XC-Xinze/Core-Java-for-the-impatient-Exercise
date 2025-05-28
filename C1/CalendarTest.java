package C1;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args){
        Scanner inputDate = new Scanner(System.in);
        System.out.println("Year:");
        int year=inputDate.nextInt();
        System.out.println("Month:");
        int month=inputDate.nextInt();
        int daysum=0;
        
        for(int i=1900;i<year;i++){
            if (i%4==0 && i%100!=0 || i%400 ==0)
                daysum+=366;
            else daysum+=365;
        }
        for(int i = 1 ;i<month;i++){
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
                daysum+=31;
            else if(i==4||i==6||i==9||i==11)
                daysum+=30;
            else if(i==2){
                if(year%4==0 && year%100!=0 || year%400 ==0)
                    daysum+=29;
                    else daysum+=28;
                }
            else daysum+=28;
        }
        int weekDate = 1+daysum%7;
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            daysum=31;
        else if(month==4||month==6||month==9||month==11)
            daysum=30;
        else if(month==2){
            if(year%4==0 && year%100!=0 || year%400 ==0)
                daysum=29;
            else daysum=28;
        }
        month=1;
        while (daysum>0){
            System.out.print(month+"Date is ");
            switch (weekDate)
            {
                case 1:System.out.print("M\n");break;
                case 2:System.out.print("T\n");break;
                case 3:System.out.print("W\n");break;
                case 4:System.out.print("T\n");break;
                case 5:System.out.print("F\n");break;
                case 6:System.out.print("S\n");break;
                case 0:System.out.print("S\n");break;
            }
            weekDate=(weekDate+1)%7;
            month++;
            daysum--;
        }
    }
} 
    

