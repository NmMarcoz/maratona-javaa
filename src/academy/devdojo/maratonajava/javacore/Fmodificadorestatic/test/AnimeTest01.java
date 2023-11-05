package academy.devdojo.maratonajava.javacore.Fmodificadorestatic.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatic.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime01 = new Anime("One piece" );
        Anime anime02 = new Anime("One piece" );
        Anime anime03 = new Anime("One piece" );
        System.out.println();
        System.out.println("------------------------");
        for(int episodes:anime01.getEpisodes()){
            System.out.print(episodes + " ");
        }

    }
}
