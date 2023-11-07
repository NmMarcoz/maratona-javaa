package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Professor {
    private String name;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String name, String especialidade){
        this.name = name;
        this.especialidade = especialidade;
    }
    public Professor(String name, String especialidade, Seminario[] seminarios){
        this.name = name;
        this.especialidade = especialidade;
        this.seminario = seminarios;
    }

    public void console(){
        System.out.println("Nome do professor: "+ this.name);
        System.out.println("Especialidade do professor: "+this.especialidade);
        if(seminario != null){
            System.out.println("Seminarios deste professor:");
            for(Seminario seminarios: seminario){
                seminarios.console();
                System.out.println("-------------------");

            }
        }
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
    public Seminario[] getSeminario(){
        return this.seminario;
    }
}
