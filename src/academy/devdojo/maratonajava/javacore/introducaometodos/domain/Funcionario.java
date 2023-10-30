package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void console(){
        System.out.println("Nome do funcionário é: " + this.nome);
        System.out.println("Idade do funcionário é: " + this.idade);
        if(salario != null){
            System.out.println("Salário 1 é: " + salario[0]);
            System.out.println("Salário 2 é: " + salario[1]);
            System.out.println("Salário 3 é: " + salario[2]);
        }

    }

    public void media(){
        double soma = 0;
        double  media = 0;
        if(salario != null){
            for (double temp: salario){
                soma = temp;
            }
            media = soma / salario.length;
            System.out.println("Média dos salários é: " + media);
        }

    }
}
