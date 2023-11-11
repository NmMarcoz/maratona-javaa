package academy.devdojo.maratonajava.javacore.Lclassesabstratar.domain;

public class Gerente extends Funcionario{
    public Gerente(String name, double salario){
        super(name, salario);

    }

    @Override
    public void printaAqui() {
        System.out.println("Gael!");
    }

    @Override
    public void console() {
        System.out.println("Nome do gerente: " + this.name);
        System.out.println("Salario do gerente: " + this.salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario*1.15;
    }
}
