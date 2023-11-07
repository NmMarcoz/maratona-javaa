package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time1 = new Time("Seleção Brasileira");

        Jogador jogador1 = new Jogador("Cafu", time1);
        Jogador jogador2 = new Jogador("Neymar", time1);

        Jogador[] jogadores = {jogador1, jogador2};
        time1.setJogadores(jogadores);

        time1.console();
        System.out.println("---------JOGADORES-----------");
        jogador1.console();
        jogador2.console();

    }
}
