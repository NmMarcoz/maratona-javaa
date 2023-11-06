package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Escola {
    private String name;
    private Professor[] professores;

    public Escola(String name){
        this.name = name;
    }
    public Escola(String name, Professor[] professores){
        this.name = name;
        this.professores = professores;
    }
    public void console(){
        System.out.println("Nome da escola: " + this.name);
        if(professores!= null){
            for(Professor professor: professores){
                System.out.println("Nome dos professores: "+professor.getName());
            }
        }
    }


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


}
