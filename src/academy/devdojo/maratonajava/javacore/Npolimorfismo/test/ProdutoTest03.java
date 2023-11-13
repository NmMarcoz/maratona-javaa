package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;
import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class ProdutoTest03 {
    public static void main(String[] args){
        Produto produto = new Computador("Ryzen 9", 16000d);
        Tomate tomate = new Tomate("Siciliano", 10);
        Computador computador = new Computador("Asus r16", 2400);
        tomate.setDataDeValdiade("02-09-2024");
        System.out.println(tomate.getDataDeValdiade());
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(computador);

    }
}
