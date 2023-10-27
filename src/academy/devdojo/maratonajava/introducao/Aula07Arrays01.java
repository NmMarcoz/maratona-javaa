package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args){
        int[] idades = null; // Tipos de reference podem ser inicializados como nulo.
        int[] idades2 = new int[3]; //No java precisamos falar quantos "slots" de memória vamos utilizar na array.
        idades2[0] = 21;
        idades2[1] = 11;
        idades2[2] = 15;
        System.out.println(idades2);
    }
}
