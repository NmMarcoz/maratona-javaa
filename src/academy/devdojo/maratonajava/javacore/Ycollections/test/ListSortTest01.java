package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Shingeki no Kyojin");
        mangas.add("One Piece");
        mangas.add("Berserk");
        mangas.add("Kaijuu n8");
        mangas.add("Yuyu no Hakushu");
        mangas.add("Inuyasha");

        System.out.println(mangas);
        System.out.println("sorting ");
        Collections.sort(mangas);
        System.out.println(mangas);

        List<Float> dinheiros = new ArrayList<>();
        dinheiros.add(23.5F);
        dinheiros.add(22.5F);
        dinheiros.add(276.5F);
        dinheiros.add(2.5F);
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println("sorting");
        System.out.println(dinheiros);


    }
}
