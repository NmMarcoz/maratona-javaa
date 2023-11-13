package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;

public class ProdutoTest02 {
    public static void main(String[] args){
        Produto produto = new Computador("Ryzen 9", 16000d);

        System.out.println(produto.getName());
        System.out.println(produto.getPrice());
        System.out.println(produto.calcularImposto());
    }
}
