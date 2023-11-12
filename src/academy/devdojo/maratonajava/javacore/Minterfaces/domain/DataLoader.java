package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 20; // Todos os atributos em uma interface são constantes!
    void load(); //Em interfaces os métodos já são public abstrac de berço!
    default void checkPermission(){
        System.out.println("Checando permissões");
    }

}
