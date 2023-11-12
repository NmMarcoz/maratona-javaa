package academy.devdojo.maratonajava.javacore.Lclassesabstratar.domain;

public class Gerente extends Funcionario{
    private int mesIngresso;
    public Gerente(String name, double salario){
        super(name, Math.round(salario));

    }
    public Gerente(String name, double salario, int mesIngresso){
        this(name,Math.round(salario));
        this.mesIngresso = mesIngresso;
    }

    @Override
    public void printaAqui() {
        System.out.println("Gael!");
    }

    @Override
    public void console() {
        System.out.println("Nome do gerente: " + this.name);
        System.out.println("Salario do gerente: " + this.salario);
        System.out.println("Seu próximo salário será de: " + Math.round(this.calcularAumento()));
        mesDoAumento();
    }

    public double calcularAumento(){
        return Math.round(this.salario*1.15);
    }

    public void mesDoAumento(){
        int mesDoAumento = mesIngresso + 12;
        System.out.println("Seu próximo aumento será daqui a: "+ mesDoAumento + " meses"); //MAKAKKOR
    }

    @Override
    public void calculaBonus() {
        this.salario = salario*1.15;
    }
}
