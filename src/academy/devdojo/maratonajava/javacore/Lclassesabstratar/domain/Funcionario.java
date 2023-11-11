package academy.devdojo.maratonajava.javacore.Lclassesabstratar.domain;

public abstract class Funcionario extends Pessoa{
    protected String name;
    protected double salario;

    public Funcionario(String name, double salario) {
        this.name = name;
        this.salario = salario;
        calculaBonus();
    }

    public void console(){
        System.out.println("nome do funcionário: "+this.name);
        System.out.println("salario do funcionário: "+this.salario);
    }

    public abstract void calculaBonus(); // O método abstrato obriga com que classes que herdarem necessitem implementar o método em seu próprio corpo!

    public void printaAqui(){
        System.out.println("Gabs!");
    }
}
