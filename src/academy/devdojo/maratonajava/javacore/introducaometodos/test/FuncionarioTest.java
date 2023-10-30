package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        double[] salarios = {1200,2500,3700};
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Joaquim";
        funcionario.idade = 27;
        funcionario.salario = new double[]{1200d,2700d,3250d};


        funcionario.console();
        funcionario.media();

    }


}
