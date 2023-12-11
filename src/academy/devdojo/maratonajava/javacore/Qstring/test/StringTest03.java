package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest03 {
    public static void main(String[] args){
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo decorrido para String normal: " + (fim - inicio) + " milissegundos");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo decorrido para String Builder: " + (fim - inicio)+ " milissegundos");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo decorrido para String Buffer: " + (fim - inicio)+ " milissegundos");
    }
    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
      private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
}
