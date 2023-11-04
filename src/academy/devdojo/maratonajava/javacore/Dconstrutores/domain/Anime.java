package academy.devdojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {

    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String relevance;

    private String estudio;

    public Anime(String name, String type, int episodes, String gender, String relevance){
        System.out.println("Dentro do construtor");
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
        this.relevance = relevance;
    }

    public Anime( String name, String type, int episodes, String gender, String relevance, String estudio){
        this(name, type, episodes, gender, relevance);
        this.estudio = estudio;
    }



    public void init(String name, String type, String gender, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public void init(String name, String type, String gender, int episodes, String relevance) {
        this.init(name, type, gender, episodes);
        this.relevance = relevance;
    }

    public void console() {
        System.out.println("Nome do anime é: " + this.name);
        System.out.println("Tipo do anime é: " + this.type);
        System.out.println("Gênero do anime é: " + this.gender);
        if (this.relevance != null) {
            System.out.println("Relevância do anime é: " + this.relevance);
        }
        if(this.estudio != null){
            System.out.println("Estúdio do anime: " + this.estudio);
        }
        System.out.println("O anime possui " + this.episodes + " episódios");


    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }
}

