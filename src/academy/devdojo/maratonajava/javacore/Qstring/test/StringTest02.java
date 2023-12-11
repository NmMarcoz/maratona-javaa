package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "goku";
        String[] nomes = {"Dokan", "Sayonara", "Mahoraga"};
        System.out.println(nome.charAt(3)); // retorna o char na posição 3 da sting. Lembrando, string é um array! Então, leia-se como letra no índice 3 da array nome.
        System.out.println(nome.length());
        System.out.println(nome.replace("u", "l")); //Troca o target (u) pelo replacemente (l)
        System.out.println(nome.toUpperCase()); // Para maiusculo
        System.out.println(nome.toLowerCase()); // Para minusculo

        String subnome;
        String trimTest = "    LUFFY";

        subnome = nome.substring(0, 2); // Reparte a String baseada no valor de inicio e final que você bota ali como parâmetro, valores estes referentes ao índice. Se nao passar nenhum valor no segundo parametro, o substring vai só pegar de onde você quer começar e terminar no final da String.
        System.out.println(subnome);
        System.out.println(trimTest.trim()); // Remove os valores em branco do começo e do fim da String.
        //System.out.println(nomes.length);
    }
}
