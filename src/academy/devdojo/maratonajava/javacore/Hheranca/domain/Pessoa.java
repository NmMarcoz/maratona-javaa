package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
     protected String name;//Agora todas classes do pacote e subclasses extendidas tem acesso a este atributo como se fosse público!
     protected String cpf;
     private Endereco endereco;


     public Pessoa(){

     }
     public Pessoa(String name){
         this.name = name;
     }

     public Pessoa(String name, String cpf){
         this(name);
         this.cpf = cpf;
     }
     public Pessoa(String name, String cpf, Endereco endereco){
         this.name = name;
         this.cpf = cpf;
         this.endereco = endereco;
     }

     public void console(){
         System.out.println("Nome da pessoa: " +this.name);
         System.out.println("Cpf da pessoa: " +this.cpf);
         if(endereco!= null){
             System.out.println("Endereco da pessoa: " + endereco.getRua() + endereco.getCep());

         }
     }

     public void setName(String name){
         this.name = name;
     }
     public String getName(){
         return this.name;
     }
     public void setCpf(String cpf){
         this.cpf = cpf;
     }

     public String getCpf(){
         return this.cpf;
     }
     public void setEndereco(Endereco endereco){
         this.endereco = endereco;
     }

}
