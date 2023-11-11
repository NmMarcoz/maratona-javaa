package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataLoader;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load(){
        System.out.println("Carregando dados....");
    }
}