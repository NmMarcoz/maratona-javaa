package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExcpetionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(4,0));
    }
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if( b == 0){
            throw new IllegalArgumentException("Argumento ilegal. A divisão não pode ser feita por zero."); // Joga o erro pro usuário e permite não precisar de um return 0.
        } // MARTIELO
        return a/b;
    }
}
