package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.nome = "Jiraya";

        pessoa01.setTipoSanguineo("O-");
        pessoa01.setIdade(18);
        pessoa01.console();
        System.out.println("Nome da pessoa pelo get: " +pessoa01.getNome());

    }
}
