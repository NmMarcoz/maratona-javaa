package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodes;

    { //Neste bloco podemos adicionar inicializações que terão prioridade maior que construtores! No caso, serão rodadas primeiro.
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
        for (int episodes : this.episodes) {
            System.out.print(episodes + " ");
        }
    }

    public int[] getEpisodes(){
        return this.episodes;
    }
}
