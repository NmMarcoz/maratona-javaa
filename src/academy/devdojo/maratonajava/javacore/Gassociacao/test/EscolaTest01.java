package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Aristóteles");
        Professor professor2 = new Professor("Cobalt");
        Professor[] professores = {professor1, professor2};
        Escola escola1 = new Escola("Ruben Goulart", professores);

        escola1.console();
    }
}
