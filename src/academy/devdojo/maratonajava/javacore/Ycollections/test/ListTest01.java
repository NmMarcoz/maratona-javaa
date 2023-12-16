package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        //--------------------Declaração antiga da versão JAVA 4-----------------------//
        List nomes = new ArrayList(); //A lista é orientada a interface, logo precisamos definir que objeto essa lista vai receber.
        nomes.add("Jonas Brothers");
        nomes.add("One Direction");
        nomes.add(257);
        System.out.println(nomes);
        System.out.println("Iteirando sobre");
        for (Object nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("---------------");
        //Essa é a sintaxe nova para definir obrigatoriamente, em tempo de compilação, o tipo de dado que essa lista vai receber.
        List<String> names = new ArrayList();
        names.add("Marcos");
        names.add("Nogueira");

        for (Object name : names) {
            System.out.println(name);
        }
        // ou
        System.out.println("--");
        names.add("rafael");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println(names.get(2));
    }
}
