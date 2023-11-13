package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO_FINAL = 0.06;

    private String dataDeValdiade;
    public Tomate(String name, double price){
        super(name, price);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.price*IMPOSTO_FINAL;
    }

    public void setDataDeValdiade(String dataDeValdiade) {
        this.dataDeValdiade = dataDeValdiade;
    }
    public String getDataDeValdiade(){
        return this.dataDeValdiade;
    }
}
