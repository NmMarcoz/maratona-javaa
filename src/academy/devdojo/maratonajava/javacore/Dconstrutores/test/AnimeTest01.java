package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args){

        Anime anime02 = new Anime("Kaguya-Sama"); // Com o construtor feito agora só é possível construir o objeto com parâmetros que estabelecemos!
        anime02.init("Akudama Drive", "Romance", "Shounen", 120, "Popular");
        anime02.console();

    }
}
