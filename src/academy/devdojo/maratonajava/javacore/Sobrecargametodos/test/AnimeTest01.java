package academy.devdojo.maratonajava.javacore.Sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Sobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime01 = new Anime();

        anime01.setName("Kaguya Sama");
        anime01.setType("Romance");
        anime01.setGender("Shounen");
        anime01.setEpisodes(150);

        anime01.console();

        //---------------------Configurando outro objeto agora!
        System.out.println("---------------------------------");
        System.out.println("Anime 2 agora!");
        Anime anime02 = new Anime();
        anime02.init("One Piece", "Aventura", "Shounen", 1085);
        anime02.console();

        //---------------------Configurando outro objeto agora!
        System.out.println("---------------------------------");
        System.out.println("Anime 3 agora!");
        Anime anime03 = new Anime();
        anime03.init("Boku no hero", "Ação", "Shounen", 1085, "Muito boa!");
        anime03.console();
    }

}
