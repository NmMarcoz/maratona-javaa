package academy.devdojo.maratonajava.javacore.Isobrescrita.domain;

public class Anime {
    private String name;

    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return "Anime:" + this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
