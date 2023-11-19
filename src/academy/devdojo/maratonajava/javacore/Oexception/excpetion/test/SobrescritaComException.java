package academy.devdojo.maratonajava.javacore.Oexception.excpetion.test;

import academy.devdojo.maratonajava.javacore.Oexception.excpetion.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.excpetion.domain.Login;
import academy.devdojo.maratonajava.javacore.Oexception.excpetion.domain.Pessoa;

public class SobrescritaComException {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        //pessoa.salvar();
       try{
           funcionario.salvar();
       }catch(Login error){
           error.printStackTrace();
       }
    }
}
