package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

import java.sql.SQLOutput;

public class Jogador {
    private String name;

    public Jogador(String nome){
        this.name = nome;
    }

    public void console(){
        System.out.println("Nome do jogador: " + this.name);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
