package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataLoader;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando dados....");
    }

    public void remove(){
        System.out.println("Removendo dados....");
    }

}