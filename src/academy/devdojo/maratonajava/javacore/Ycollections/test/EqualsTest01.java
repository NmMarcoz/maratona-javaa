package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Marcos Nogueira";
        String nome2 = "Marcos Nogueira";

        System.out.println(nome == nome2);
        System.out.println("O caso acima da true pq estão na mesma pool de strings!");


        String name = "Marcos Nogueira";
        String name2 = new String("Marcos Nogueira");
        System.out.println("E agora?");
        System.out.println(name == name2);
        //Para isso vamos usar a collection Equals.

        System.out.println("----------");
        System.out.println(name.equals(name2));// Aqui ele ta comparando o valor mesmo da String.

        Smartphone s1 = new Smartphone("ASDKJG", "Samsung");
        Smartphone s2 = new Smartphone("ASDKJG", "Samsung");
        Smartphone s3 = s1;

        System.out.println("-----------------");

        Boolean eq = s1.equals(s2);
        System.out.println(eq);
        System.out.println("A marca é a mesma? ");
        System.out.println(s1.getMarca().equals(s2.getMarca()));
        System.out.println("O serial é o mesmo?");
        System.out.println(s1.getSerialNumber().equals(s2.getSerialNumber()));
        System.out.println("----------------");
        System.out.println("S1 é igual a S3?");
        System.out.println(s1.equals(s3)); // Sim, pois os dois fazem referência para o mesmo objeto.
    }
}
