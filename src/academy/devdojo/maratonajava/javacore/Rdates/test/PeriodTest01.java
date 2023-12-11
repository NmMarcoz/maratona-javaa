package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.now().plusYears(7).plusDays(5);
        Period p1 = Period.between(d1, d2);
        Period p2 = Period.ofWeeks(55);
        System.out.println(p2.getDays()/30);
        System.out.println(p1);
    }
}
