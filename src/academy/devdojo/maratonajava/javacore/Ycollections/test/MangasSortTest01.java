package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sorteMangaById implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangasSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(8L, "Berserk", 30.99));
        mangas.add(new Manga(2L, "Bakuman", 120.22));
        mangas.add(new Manga(5L, "Boku no hero", 30.25));
        mangas.add(new Manga(9L, "Banana fish", 39.20));
        mangas.add(new Manga(12L, "Btooom", 49.80));
        mangas.add(new Manga(12L, "Btooom", 49.80));
        mangas.add(new Manga(13L, "Bokan", 49.80)); //

        for (Manga mg : mangas) {
            System.out.println(mg.getId());
            System.out.println("-----");
        }
        System.out.println("------------------SORTING------------------");
        Collections.sort(mangas, new sorteMangaById());
        for (Manga mg : mangas) {
            System.out.println(mg.getId());
            System.out.println("----");
        }
         //System.out.println(mangas.get(5).getId().equals((mangas.get(4).getId())));
    }
}
