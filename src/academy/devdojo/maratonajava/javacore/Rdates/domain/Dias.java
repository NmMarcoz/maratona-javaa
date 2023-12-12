package academy.devdojo.maratonajava.javacore.Rdates.domain;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Dias {
    private LocalDateTime dataAtual;

    public Dias(){

    }
    public Dias(LocalDateTime dataAtual){
        this.dataAtual = dataAtual;
    }

    public void proximoDiaUtil(LocalDateTime dataAtual){
        LocalDateTime now = this.dataAtual;
        do{
            dataAtual = dataAtual.plusDays(1);
        }while(dataAtual.getDayOfWeek() == DayOfWeek.SATURDAY || dataAtual.getDayOfWeek() == DayOfWeek.SUNDAY);
        System.out.println("Proximo dia útil: " + dataAtual.getDayOfWeek());
    }

}
