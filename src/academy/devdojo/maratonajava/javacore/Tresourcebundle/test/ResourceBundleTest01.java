package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(resourceBundle.containsKey("hello"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle2.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
        System.out.println(resourceBundle2.getString("good.morning"));
    }
}
