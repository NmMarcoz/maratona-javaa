package academy.devdojo.maratonajava.javacore.Rdates.test;

import academy.devdojo.maratonajava.javacore.Rdates.domain.Dias;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        //now = now.plusDays(2);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        now = now.with(ChronoField.DAY_OF_MONTH,11);
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.SATURDAY)); //Troca para o sábado anterior. Se usar o same ele vai te responder o mesmo dia, caso este seja o sabado.
        System.out.println(now);
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());

        Dias dia = new Dias();
        System.out.println("Exercício");
        System.out.println("-----------------------------------------");
        System.out.println(LocalDateTime.now().plusDays(4).getDayOfWeek()); ///////////////////
        dia.proximoDiaUtil(LocalDateTime.now().plusDays(4));
    }
}
