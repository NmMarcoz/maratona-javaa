package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class NumberFormateTest02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        NumberFormat.getNumberInstance();
        Locale localePt = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;
        Locale localeFr= Locale.FRANCE;
        NumberFormat[] nfs = new NumberFormat[4];
        nfs[0] = NumberFormat.getCurrencyInstance(localePt); // Esse aqui é para valor monetário!
        nfs[1] = NumberFormat.getCurrencyInstance(localeJp);
        nfs[2] = NumberFormat.getCurrencyInstance(localeIt);
        nfs[3] = NumberFormat.getCurrencyInstance(localeFr);
        


        double value = 10_000_2130;
        for(NumberFormat nfa: nfs){
            System.out.println(nfa.format(200));
        }
    }
}
