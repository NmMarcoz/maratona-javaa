package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String texto1 = "abuabuu";
        String texto2 = "abababababab";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println(matcher);
        while(matcher.find()){
            System.out.println(matcher.start() + " ");
        }
    }
}
