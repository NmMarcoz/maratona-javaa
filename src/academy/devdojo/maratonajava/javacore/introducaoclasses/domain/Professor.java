package academy.devdojo.maratonajava.javacore.introducaoclasses.domain;

public class Professor {
    public String nome;
    public String materia;
    public int idade;
    public char sexo;

    public void console(){
        System.out.println("Nome do professor é: " + this.nome);
        System.out.println("Idade do professor é: " + this.idade);
        System.out.println("Matéria do professor é: " + this.materia);
        System.out.println("Sexo do professor é: " + this.sexo);




    }
}
