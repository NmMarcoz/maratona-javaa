package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        //--------------------Declaração antiga da versão JAVA 4-----------------------//
        List<String> nomes = new ArrayList(); //A lista é orientada a interface, logo precisamos definir que objeto essa lista vai receber.
        nomes.add("Jonas Brothers");
        nomes.add("One Direction");
        //nomes.add(257);
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
        List<String> test = new ArrayList();

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

        for(int i = 0; i <= 12; i++){
            test.add("a");
        }
        System.out.println(test);

        List<Integer> numeros = new ArrayList<>(); //Aqui não aceita tipos primitivos, somente objetos. Então usamos os Wrappers!
        numeros.add(22);
        numeros.add(11);
        numeros.add(33);
        numeros.remove(2); //Pode-se remover passando o índice
        names.remove("Nogueira"); //E pode-se remover passando um objeto! Aqui ele utiliza o equals.
        System.out.println(numeros);
        System.out.println(names);

        List<String> nomes3 = new ArrayList<>();
        nomes3.addAll(nomes);
        nomes3.addAll(names);
        System.out.println("printando nomes 3");
        System.out.println(nomes3);

    }
}
