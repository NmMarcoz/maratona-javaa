package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recurssividade(); //Estouramos a memória disponível para a stack com isso aqui!
    }
    public static void recurssividade(){ //Erro não conseguimos recuperar!
        recurssividade();
    }
}
