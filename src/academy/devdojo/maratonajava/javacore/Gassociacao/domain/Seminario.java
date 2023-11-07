package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Seminario {
    private String titulo;
    private String localizacao;

    private Professor professor;

    private Aluno[] alunos;

    public Seminario(String titulo, Professor professor){
        this.titulo = titulo;
        this.professor = professor;
    }

    public void console(){
        System.out.println("Tema do seminário: "+ this.titulo);
        System.out.println("Localização do seminário: "+ this.localizacao);
        if(professor!= null){
            System.out.println("Professor responsável pelo seminário: "+ this.professor.getName());
        }
        if(alunos!= null){
            System.out.println("Nome dos alunos inscritos no seminário: ");
            for(Aluno aluno: alunos){

                System.out.println(aluno.getName());
            }
        }else System.out.println("Não há alunos inscritos ainda!");

    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    public String getLocalizacao(){
        return this.localizacao;
    }

    //-------------------Objetos-------------------------


    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor(){
        return this.professor;
    }
}
