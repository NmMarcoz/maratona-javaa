package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora  calc = new Calculadora();
        calc.soma(25, 65);
        calc.sub(15, 23);
        calc.divisao(10, 5);
        calc.multiplicacao(15, 28);
    }

}
