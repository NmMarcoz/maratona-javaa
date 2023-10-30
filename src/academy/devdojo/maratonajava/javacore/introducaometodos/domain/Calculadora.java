package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Calculadora {
    public void soma(int n1, int n2){
        System.out.println("Soma é: " + (n1 + n2));
    }
    public void sub(int n1, int n2){
        System.out.println("Subtração é: " + (n1 - n2));
    }
    public void divisao(float n1, float n2){
        if(n2 ==0){
            System.out.println("Infinito.");
        }else{
            System.out.println("Divisão é: " + (n1/n2));
        }
    }
    public void multiplicacao(int n1, int n2){
        System.out.println("Multiplicação é: " +(n1*n2));
    }

    public boolean isPar(int n1){
        if(n1 % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public void somaArray(int[] nums1){
        int soma = 0;
        for(int temp: nums1){
            soma = soma + temp;
        }
        System.out.println("Soma da array é: " + soma);
    }



}
