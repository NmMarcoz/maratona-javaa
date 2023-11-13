package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args){
        Computador pc1 = new Computador("Asmodeus Ryzen 7", 8000);
        Tomate tomate1 = new Tomate("Tomate siciliano", 10);
        CalculadoraImposto.calcularImposto(pc1);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tomate1);

    }

}
