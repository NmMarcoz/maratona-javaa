package academy.devdojo.maratonajava.javacore.Xserialization.domain;

import java.beans.Transient;
import java.io.Serializable;

public class Aluno implements Serializable {
        private Long id;
        private String nome;
        private  transient String password;

        public Aluno(Long id, String nome, String password){
            this.id = id;
            this.nome = nome;
            this.password = password;

        }  public Aluno(){

        }

        public void setId(Long id){
            this.id = id;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setPassword(String password){
            this.password = password;
        }

        public String getNome(){
            return this.nome;
        }
        public Long getId(){
            return this.id;
        }
        public void console(){
            System.out.println("O nome é: " + this.nome);
            System.out.println("O ID é " + this.id);
            System.out.println("O password é: " + this.password);
        }


}
