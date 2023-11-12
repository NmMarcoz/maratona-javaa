package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computador extends Produto{
    public static final double IMPOSTO_FINAL = 0.21;
    public Computador(String name, double price){
        super(name, price);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do pc");
        return this.price*IMPOSTO_FINAL;
    }
}
