package academy.devdojo.maratonajava.javacore.Oexception.excpetion.test;

import academy.devdojo.maratonajava.javacore.Oexception.excpetion.domain.Login;

import java.util.Scanner;
//------------------------------//----------------------------------//-----------------------------------//
public class LoginTest01 {
    public static void main(String[] args) {
        try {
            logar();

        } catch(Login erro){
            erro.printStackTrace();
        }
    }
    private static void logar() throws Login {
        Scanner leitor = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "SSJ";
        System.out.println("Usuário ");
        String usernameDig = leitor.nextLine();
        System.out.println("Senha ");
        String senhaDig = leitor.nextLine();
        if(!usernameDB.equals(usernameDig) || !senhaDig.equals(senhaDB)){
            throw new Login("Usuário ou senha inválidos!");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}