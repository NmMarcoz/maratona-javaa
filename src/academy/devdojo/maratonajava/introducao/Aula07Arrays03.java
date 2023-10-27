package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5}; //Inicializando com valores já!

        for (int i = 0; i <numeros2.length ; i++) {
            System.out.println(numeros2[i]);
        }
        System.out.println("Usando o foreach agora!");

        for(int i:numeros2){
            System.out.println(i);
        }
    }
}
