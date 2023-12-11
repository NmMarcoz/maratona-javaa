package academy.devdojo.maratonajava.Rdates.test;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Data");
        System.out.println(calendar.getTime());
        System.out.println("Primeiro dia da semana");
        if (calendar.getFirstDayOfWeek() == calendar.SUNDAY){
            System.out.println("domingo!");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        calendar.add(Calendar.DAY_OF_WEEK, 2);
        System.out.println(calendar.getTime());
        System.out.println("voltando!");
        calendar.roll(Calendar.DAY_OF_WEEK, 5);
        System.out.println(calendar.getTime());
    }
}
