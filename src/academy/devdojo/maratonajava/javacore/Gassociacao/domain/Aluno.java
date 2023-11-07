package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Aluno {
    private String name;

    private Seminario seminario;

    private int idade;

    public Aluno(String name, int idade, Seminario seminario){
        this.name = name;
        this.idade = idade;
        this.seminario = seminario;
    }
    public Aluno(String name, int idade){
        this.name = name;
        this.idade = idade;
    }


    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

    public Seminario seminario(){
        return this.seminario;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

}
