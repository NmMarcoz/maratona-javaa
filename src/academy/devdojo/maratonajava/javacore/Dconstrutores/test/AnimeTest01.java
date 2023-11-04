package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args){

        Anime anime02 = new Anime("Kaguya-Sama", "Romance", 125, "Shounen", "Popular"); // Com o construtor feito agora só é possível construir o objeto com parâmetros que estabelecemos!
        Anime anime03 = new Anime("Hunter x Hunter", "ação", 120, "Shounen", "Popular", "Madhouse");
        anime02.console();
        System.out.println("-----------------------------------------");
        anime03.console();

    }
}
