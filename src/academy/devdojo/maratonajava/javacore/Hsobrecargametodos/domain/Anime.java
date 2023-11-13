package academy.devdojo.maratonajava.javacore.Hsobrecargametodos.domain;

public class Anime {

    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String relevance;

    public void init(String name, String type, String gender, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    //Sobrecarga de métodos!
    //Podemos ter métodos com nomes iguais e que podem ter mais parâmetros distintos!
    //Legal né?
    public void init(String name, String type, String gender, int episodes, String relevance){
        this.init(name, type, gender, episodes);
        this.relevance = relevance;
    }
    public void console(){
        System.out.println("Nome do anime é: " + this.name);
        System.out.println("Tipo do anime é: " + this.type);
        System.out.println("Gênero do anime é: " + this.gender);
        if(this.relevance != null){
            System.out.println("Relevância do anime é: " + this.relevance);
        }
        System.out.println("O anime possui " + this.episodes + " episódios");


    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

    public int getEpisodes(){
        return this.episodes;
    }


}
