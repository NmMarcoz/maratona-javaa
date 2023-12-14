package academy.devdojo.maratonajava.javacore.Xserialization.test;

import academy.devdojo.maratonajava.javacore.Xserialization.domain.Aluno;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Markito", "Kito8192");
        //Agora vamos querer persistir o valor disso na memória
        serializar(aluno);
        System.out.println("lendo agora");
        deserializar();


    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
            System.out.println("Escrito");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) oos.readObject();
            System.out.println("Lido");
            aluno.console();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException exception){
            System.out.println(exception.getMessage());
        }
    } // PAPABUM
}
