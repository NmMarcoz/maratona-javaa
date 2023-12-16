package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmarthphoneLisTest01 {
    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone("050505", "Samsung");
        Smartphone sm2 = new Smartphone("050525", "Iphone");
        Smartphone sm3 = new Smartphone("050535", "Google");

        List<Smartphone> smartphoneList = new ArrayList<>();

        smartphoneList.add(sm1);
        smartphoneList.add(sm2);
        smartphoneList.add(sm3);

        for(Smartphone sm: smartphoneList){
            sm.console();
            System.out.println("---");
        }
        smartphoneList.clear(); //Limpando tudo
        System.out.println(smartphoneList);
        //-----
        Smartphone sm4 = new Smartphone("050505", "Samsung");
        smartphoneList.add(sm1);
        smartphoneList.add(sm2);
        smartphoneList.add(sm3);
        smartphoneList.add(sm4);
        System.out.println(smartphoneList.get(3).equals(smartphoneList.get(0)));
        smartphoneList.contains(sm2);
        System.out.println(smartphoneList.indexOf(sm2));
    }
}
