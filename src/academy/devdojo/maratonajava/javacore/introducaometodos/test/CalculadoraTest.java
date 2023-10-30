package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        int[] nums = {225, 1050, 373};
        Calculadora  calc = new Calculadora();
        calc.soma(25, 65); //JKKASKASJHNIASDNJKPzXJKNCZXC
        calc.sub(15, 23);
        calc.divisao(10, 24);
        calc.multiplicacao(15, 28);
        calc.somaArray(nums);
        System.out.println(calc.isPar(15));
    }

}
