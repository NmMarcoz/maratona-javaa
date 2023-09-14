package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;
public class calculadora {
    public static void main(String[] args){
        Scanner visualizador = new Scanner(System.in);
        System.out.println(("Hello there, bem vindo a sua academy.devdojo.maratonajava.introducao.calculadora java!"));
        System.out.println("Escolha sua operação!");
        System.out.println("1. Soma");
        System.out.println("2. Sub");
        System.out.println("3. Mult");
        System.out.println("4. Div");


        int escolha = visualizador.nextInt();

        Boolean escolha_valida = true;

        if (escolha != 1 && escolha != 2 && escolha != 3 &&  escolha !=4){
            escolha_valida = false;
        }
        if(escolha_valida) {
            System.out.println("Digite dois números");
            float number1 = visualizador.nextFloat();
            float number2 = visualizador.nextFloat();
            visualizador.close();
            if (escolha == 1){
                System.out.println("Resultado:");
                soma(number1, number2);
            } else if (escolha ==2) {
                System.out.println("Resultado:");
                sub(number1, number2 );
            }else if (escolha ==3 ) {
                System.out.println("Resultado:");
                mult(number1, number2 );
            }
            else if (escolha == 4 ) {
                System.out.println("Resultado:");
                div(number1, number2 );
            }
        }
        else{
            System.out.println("Digite uma escolha válida!");
        }

    }
    public static void soma(float i, float p){
        System.out.println(i + p);
    }
    public static void sub(float i, float p){

        if( p > i){
            System.out.println("O valor será negativo!");
        }
        System.out.println(i - p);
    }
    public static void div(float i, float p){
        System.out.println(i/p);
    }
    public static void mult(float i, float p){
        System.out.println(i*p);
    }
}