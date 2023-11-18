package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExcpetionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            return "Conexão aberta";
            //System.out.println("Esdrevendo dados no arquivo");

        } catch (Exception error) {
            error.printStackTrace();
        } finally {
            System.out.println("Fechando o recurso computacional alocado"); //O código no finally executa independente de ter uma exception ou não. E mesmo se tivermos um return antes, ele continua a executar.
        }
        return null;
    }
}
