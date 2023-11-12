package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando dados do arquivo...");
    }
    public void remove(){
        System.out.println("Removendo dados do arquivo...");
    }

}
