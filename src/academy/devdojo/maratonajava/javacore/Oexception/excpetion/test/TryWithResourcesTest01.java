package academy.devdojo.maratonajava.javacore.Oexception.excpetion.test;

import academy.devdojo.maratonajava.javacore.Oexception.excpetion.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.excpetion.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo3();
    }


    public static void lerArquivo3(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException error){
            System.out.println("mensagem do erro: " + error.getMessage());
        }
    }
    public static void lerArquivo2(){
        try(Reader reader = new BufferedReader(new FileReader("Test.txt"))){ //Dessa vez é um try with resources. O java vai se encarregar de implementar o closable!

        }catch(IOException error){
            System.out.println("mensagem do erro: " + error.getMessage());
        }
    }
    public static void lerArquivo(){
        Reader leitor = null;

        try{
            leitor = new BufferedReader( new FileReader("teste.txt"));
        }catch(FileNotFoundException error){
            System.out.println("Mensagem do erro: "+  error.getMessage());
        }finally {
            try{
                if(leitor != null){
                    leitor.close();
                }
            }catch(IOException error){
                System.out.println("Mensagem do erro: " + error.getMessage());
            }

        }
    }
}
