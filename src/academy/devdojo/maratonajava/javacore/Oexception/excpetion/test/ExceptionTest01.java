package academy.devdojo.maratonajava.javacore.Oexception.excpetion.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste15.txt");
        try{
            boolean isCreated = file.createNewFile(); //Criar o arquivo!
            System.out.println("Arquivo criado: "+ isCreated);
        }catch(IOException error){ // Se der algum erro, vamos capturar ele e exibir a mensagem do erro!
            System.out.println("Mensagem do erro: "+ error.getMessage());
            System.out.println("Visão geral do erro:");
            error.printStackTrace(); //Vai imprimir todo o erro!
            throw error; //Relançando a exceção.
        }
    }
}
