package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

import java.sql.SQLOutput;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String nome){
        this.name = nome;
    }

    public Jogador(String name, Time time){
        this.name = name;
        this.time = time;
    }
    public void console(){
        System.out.println("Nome do jogador: " + this.name);
        if(time != null){
            System.out.println("Time do jogador: " + time.getName());
        }
    }

    public Time getTime(){
        return time;
    }
    public void setTime(Time time){
        this.time = time;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
