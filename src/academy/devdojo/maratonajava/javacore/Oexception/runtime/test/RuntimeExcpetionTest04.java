package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExcpetionTest04 {
    //CAPTURANDO MULTIPLAS EXCEÇÕES
    //Regrinha: Não podemos colocar primeiro o tipo mais genérico, pois a exception ali vai aplicar regras de polimorfismo+
    // + disto isso, se a runtime tivesse primeiro os outros iriam se tornar UNREACHABLE.
    // então, execções mais genéricas sempre no final do código!
    public static void main(String[] args) {
        try{
            //throw new ArrayIndexOutOfBoundsException();
            //throw new IndexOutOfBoundsException();
            //throw new IllegalArgumentException();
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Dentro do erro de array " + error.getMessage());
        }catch(IndexOutOfBoundsException error){
            System.out.println("Dentro do erro de index " + error.getMessage());
        }catch(IllegalArgumentException error){
            System.out.println("Dentro do erro de argumento " + error.getMessage());
        }catch(RuntimeException error){
            System.out.println("Dentro do erro de runtime");
        }

        try{
            talvezLanceException();
        }catch(SQLException | FileNotFoundException error){ //Só é possível pq essas não estão na meesma linha de herança.
            System.out.println("Dentro da exceção sql");

        }catch(IOException error){
            System.out.println("Dentro do tipo mais genérico de exceção");
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
