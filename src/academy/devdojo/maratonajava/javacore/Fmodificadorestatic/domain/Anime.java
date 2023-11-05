package academy.devdojo.maratonajava.javacore.Fmodificadorestatic.domain;

public class Anime {
    private String nome;
    private static int[] episodes;

   static { //Agora com o bloco de inicialização estático, esse proocessamento só roda 1 vez independente da quantidade de objetos criados!
        System.out.println("Aqui é um bloco de inicialização :)");
        episodes = new int[100];
        for(int i=0; i < episodes.length; i++){
            episodes[i] = i + 1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        for (int episodes : Anime.episodes) {
            System.out.print(episodes + " ");
        }
    }

    public int[] getEpisodes(){
        return this.episodes;
    }
}
