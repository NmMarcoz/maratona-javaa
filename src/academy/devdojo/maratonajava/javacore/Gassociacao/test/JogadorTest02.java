package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Cafu");
        Time time1 = new Time("Flamengo");
        jogador1.setTime(time1);
        //-------
        jogador1.console();
    }
}
