package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String regex = "\\d"; //Retorna tudo o que for digito
        String regex2 = "\\D"; //Retorna tudo o que for não for digito
        String regex3 = "\\s"; //Retorna tudo o que espaço em branco
        String regex4 = "\\S"; //Retorna tudo o que não for espaço em branco
        String regex5 = "\\w"; //Retorna a-z, digitos e _
        String regex6 = "\\W"; //Retorna o contrário do acima
        String texto1 = "abuabuu";
        String texto2 = "h2h3h4___ h5hhhskshjakd!!?:?32";

        Pattern pattern = Pattern.compile(regex6);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println(matcher);
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + " " );
        }
    }
}
