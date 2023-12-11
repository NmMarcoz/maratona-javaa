package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCh = new Locale("it", "CH");
        Locale localeJp = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCh);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJp);

        System.out.println("Data italia : " + df.format(calendar.getTime()));
        System.out.println("Data Suíça : " + df2.format(calendar.getTime()));
        System.out.println("Data Japão : " + df3.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJp));
        System.out.println(localeCh.getDisplayCountry(localeJp));
        System.out.println(localeJp.getDisplayCountry(localeJp));

    }
}
