package academy.devdojo.maratonajava.javacore.Oexception.excpetion.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        try{
            criarNovoArquivo();
        }catch(IOException error){
            error.printStackTrace();
        }
    }
    private static void criarNovoArquivo() throws IOException{ //Aqui é recomendado tratar o erro dentro do método pois ele é privado. Nenhuma outra classe tem acesso a este método!
        File file = new File("arquivo\\teste15.txt");
        boolean isCreated = file.createNewFile(); //Criar o arquivo!
        System.out.println("Arquivo criado: "+ isCreated);
    }
}
