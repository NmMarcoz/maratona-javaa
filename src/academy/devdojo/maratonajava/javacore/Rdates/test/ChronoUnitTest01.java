package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2003,Month.SEPTEMBER, 2, 12, 0, 0);
        System.out.println("Meses desde o seu aniversário!");
        System.out.println(ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()) + " meses");
        System.out.println("Dias desde o seu aniversário");
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()) + " dias");

    }
}
