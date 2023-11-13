package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class ArchiveRepository implements Repository {
    public void salvar() {
        System.out.println("Salvando em um arquivo...");
    }
}
