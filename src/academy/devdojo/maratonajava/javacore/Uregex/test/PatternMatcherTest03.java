package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        String regex = "[abcABC]"; //vai procurar ou por A, ou por B, ou por C
        String regex2 = "[a-zA-D]"; //vai procurar de a à z minúsculo e de A à D maiusculo
        String texto1 = "abuabuu";
        String texto2 = "h2h3h4___ h5AAhhbAbhskscchBjakd!!?:?32";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println(matcher);
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + " " );
        }
    }
}
