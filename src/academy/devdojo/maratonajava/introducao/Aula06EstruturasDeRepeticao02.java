package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args){
        //Exercício, imprima todos os números pares de 0 ate x
        for(int i = 0; i <=100; i++ ){
            if(i%2 == 0){
                if (i > 25){ //Delimitador!
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
