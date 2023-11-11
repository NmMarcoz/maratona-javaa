package academy.devdojo.maratonajava.javacore.Lclassesabstratar.domain;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String name, double salario){
        super(name, salario);
    }
    @Override
    public void console(){
        System.out.println("Nome do desenvolvedor: " + this.name);
        System.out.println("Salario do desenvolvedor: " + this.salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario*1.10;
    }
}
