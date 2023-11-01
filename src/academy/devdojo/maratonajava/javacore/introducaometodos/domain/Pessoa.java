package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Pessoa {
    public String nome;
    private int idade;
    private String tipoSanguineo; //Não pode ser acessado fora da classe, somente por método

    public void console(){
        System.out.println("Nome da pessoa: " + this.nome);
        System.out.println("Idade da pessoa: "+ this.idade);
        System.out.println("tipo sanguíneo da pessoa: "+this.tipoSanguineo);
    }

    public void setTipoSanguineo(String tipoSanguineo){  //Esse é o método responsável por setar o valor daquela variável privada!
        this.tipoSanguineo = tipoSanguineo; // O uso do this OBRIGATÓRIO pois as variáveis possuem o mesmo nome!
    }

    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }
}
