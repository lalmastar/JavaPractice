package HackerRank;

import java.util.Calendar;
import java.util.Scanner;

public class Date_and_Time {
    public static String findDay(int month, int day, int year) {
        Calendar date = Calendar.getInstance();
        date.set(year, month-1, day);
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        String dayOfTheWeek = "";
        switch(dayOfWeek){
            case 1:
                dayOfTheWeek = "SUNDAY";
                break;
            case 2:
                dayOfTheWeek = "MONDAY";
                break;
            case 3:
                dayOfTheWeek = "TUESDAY";
                break;
            case 4:
                dayOfTheWeek = "WEDNESDAY";
                break;
            case 5:
                dayOfTheWeek = "THURSDAY";
                break;
            case 6:
                dayOfTheWeek = "FRIDAY";
                break;
            case 7:
                dayOfTheWeek = "SATURDAY";
                break;
        }
        return dayOfTheWeek;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
        System.out.println(findDay(month, day, year));
    }
}
