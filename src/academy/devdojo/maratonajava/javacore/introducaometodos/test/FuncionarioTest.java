package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Joaquim");
        funcionario.setIdade(27);
        funcionario.setSalario(2700, 2300, 2400);


        funcionario.console();
        funcionario.media();
        System.out.println("Utilizando os gets individuais agora!");

        System.out.println("Nome do funcionário é: "+funcionario.getNome());
        System.out.println("Idade do funcionário é: "+funcionario.getIdade());

    }


}
