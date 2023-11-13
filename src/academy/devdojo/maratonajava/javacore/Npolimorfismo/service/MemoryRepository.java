package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class MemoryRepository implements Repository {
    public void salvar(){
        System.out.println("Salvando na memória...");
    }
}
