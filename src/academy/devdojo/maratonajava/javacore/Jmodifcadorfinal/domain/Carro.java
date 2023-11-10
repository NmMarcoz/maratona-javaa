package academy.devdojo.maratonajava.javacore.Jmodifcadorfinal.domain;

public class Carro {
    private String name;

    private final Comprador COMPRADOR = new Comprador();
    private int ano;

    public static final double VELOCIDADE_LIMITE; //Final no java é usardo pra definir CONSTANTES!
    static{
        VELOCIDADE_LIMITE = 250;
    }
    public final void console(){
        System.out.println("Nome do carro: "+this.name);
        System.out.println("Ano do carro: "+ this.ano);
    }
    public double getVelocidadeLimite(){
        return VELOCIDADE_LIMITE;
    }


}
