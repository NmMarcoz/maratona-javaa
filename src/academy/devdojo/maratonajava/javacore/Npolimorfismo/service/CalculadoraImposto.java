package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getName());
        System.out.println("Valor: "+ produto.getPrice());
        System.out.println("Imposto a ser pago: "+ imposto);
        if(produto instanceof Tomate){ //Estamos verificando se o "super" objeto que passamos é uma instância de uma de suas heranças! Neste caso: Tomate
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validaded: " + tomate.getDataDeValdiade());
            System.out.println("Não é um computador!");
        }
        if(produto instanceof Computador){
            System.out.println("É um computador!");
        }


    }
}
