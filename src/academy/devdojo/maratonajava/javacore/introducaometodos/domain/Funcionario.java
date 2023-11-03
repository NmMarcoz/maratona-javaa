package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;

    private double media;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalario(double... salario){
        this.salario = salario;
    } //Var args utilizado aqui <---------------------

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
        if(salario != null){
            for (double temp: salario){
                soma = temp;
            }
            media = soma / salario.length;
            System.out.println("Média dos salários é: " +getMedia());
        }

    }

    public double getMedia(){
        media = Math.round(media);
        return this.media;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
