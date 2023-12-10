package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTes01 {
    public static void main(String[] args) {
        String nome = "Nogueira"; //String constant pool - Piscina constante de strings.
        String nome2 = "Nogueira";
        nome.concat(" Suane"); //Imutabilidade de strings. Não podemos trocar o valor dela a não ser que façamos uma nova atribuição, como na linha abaixo.
        //nome = nome.concat(" Moreira");

        System.out.println(nome == nome2);// Isso aqui significa que os dois estão fazendo referência pro mesmo objeto;

    }
}
