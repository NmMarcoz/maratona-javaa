package academy.devdojo.maratonajava.javacore.Fmodificadorestatic.domain;

public class Carro {
    private String name;
    private double maxVelo;
   private static double limVelo = 250;

    public Carro(String name, double maxVelo) {
        this.name = name;
        this.maxVelo = maxVelo;
    }

    public void console() {
        System.out.println("Nome do carro é: " + this.name);
        System.out.println("Velocidade máxima: " + this.maxVelo);
        if (limVelo != 0.0) {
            System.out.println("Limite de velocidade: " + Carro.limVelo);
        }

    }

    public static void setLimVelo(double limVelo) {
        Carro.limVelo = limVelo;
    }

    public static double getLimVelo() {
        return Carro.limVelo;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxVelo() {
        return this.maxVelo;
    }

    public void setMaxVelo(double maxVelo) {
        this.maxVelo = maxVelo;
    }
}


