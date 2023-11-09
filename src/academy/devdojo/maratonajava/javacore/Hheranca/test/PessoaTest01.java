package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua 37", "65053100");
        Pessoa pessoa1 = new Pessoa("Jonas");
        Funcionario funcionario1  = new Funcionario("Jaraka", "61147307393", 1200);

        pessoa1.setCpf("61147307393");
        pessoa1.setEndereco(endereco1);


        pessoa1.console();
        System.out.println("-----------------");
        funcionario1.console();
        funcionario1.relatorioPagamento();
    }
}
