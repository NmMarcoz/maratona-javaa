package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.ArchiveRepository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.DatabaseRepository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.MemoryRepository;

public class RepositorioTest01 {
    public static void main(String[] args){
        Repository repository = new DatabaseRepository();  //Programação orientada a interfaces. Podemos chamar como referência a interface Pai e ela terá acesso a todas classes que utilizam o método salvar();
        Repository repository2 = new ArchiveRepository();
        Repository repository3 = new MemoryRepository();
        //DatabaseRepository databaseRepository = new ArchiveRepository(); Desse modo aqui daria erro, pois estão na mesma linha de hierarquia!
        repository.salvar();
        repository2.salvar();
        repository3.salvar();
    }
}
