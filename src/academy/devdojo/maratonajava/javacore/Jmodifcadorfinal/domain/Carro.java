package academy.devdojo.maratonajava.javacore.Jmodifcadorfinal.domain;

public class Carro {
    private String name;
    private int ano;

    public static final double VELOCIDADE_LIMITE; //Final no java é usardo pra definir CONSTANTES!
    static{
        VELOCIDADE_LIMITE = 250;
    }
    public double getVelocidadeLimite(){
        return VELOCIDADE_LIMITE;
    }
}
