package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Robinho");
        Jogador jogador02 = new Jogador("Neymar");
        Jogador jogador03 = new Jogador("Roberto Carlos");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};
        for (Jogador jogador : jogadores) { //For each com uma array de objetos. Misericórdia ;-;
            jogador.console();
        }
        System.out.println("-------------------------");
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].console();
        }
    }
}
