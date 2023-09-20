package academy.devdojo.maratonajava.introducao;

public class ternario {
    public static void main(String[] args) {
        double salario = 2000;
        String mensagem1 = "Vou doar";
        String mensagem2 = "Nao posso doar";
        String resultado = salario > 3000? mensagem1: mensagem2;
        System.out.println(resultado);
    }
}
 