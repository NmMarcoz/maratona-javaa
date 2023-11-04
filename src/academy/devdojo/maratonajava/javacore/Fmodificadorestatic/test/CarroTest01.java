package academy.devdojo.maratonajava.javacore.Fmodificadorestatic.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatic.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args){
        Carro c1 = new Carro("Porsche 311 GT3s", 225);
        Carro c2 = new Carro("Toyota Trueno AE86", 120);
        Carro c3 = new Carro("Porsche Cayman", 225);
        Carro.limVelo = 190; //Por se tratar de um modificador static ele afeta a classe em si, não só o objeto. Ah, ele é public tb
        c1.console();
        System.out.println("--------");
        c2.console();
        System.out.println("--------");
        c3.console();
    }


}
