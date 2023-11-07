package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Piloto;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.TimeFormula1;

public class PilotoTest01 {
    public static void main(String[] args){
        TimeFormula1 time1 = new TimeFormula1("Ferrari");
        Piloto piloto1 = new Piloto("Carlos Sainz");
        Piloto piloto2 = new Piloto("Charles Letlec");

        piloto1.setTimeFormula1(time1);
        piloto2.setTimeFormula1(time1);
        piloto1.console();
        System.out.println("_--------------------------");
        piloto2.console();
        System.out.println("----------------------");
        time1.setPilotos(new Piloto[]{piloto1, piloto2});
        time1.console();

    }


}
