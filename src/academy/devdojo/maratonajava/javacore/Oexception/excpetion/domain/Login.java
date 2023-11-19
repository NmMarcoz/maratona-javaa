package academy.devdojo.maratonajava.javacore.Oexception.excpetion.domain;

public class Login extends Exception{
    public Login(){
        super("Login inválido");
    };
    public Login(String message){
        super(message);
    }
}
