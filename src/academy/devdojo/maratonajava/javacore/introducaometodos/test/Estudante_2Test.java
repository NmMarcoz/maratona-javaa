package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Estudante_2;

public class Estudante_2Test {
    public static void main(String[]args){
        Estudante_2 estudante = new Estudante_2();
        Estudante_2 estudante02 = new Estudante_2();

        estudante02.nome = "João";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        estudante.nome = "Malaquias";
        estudante.idade = 16;
        estudante.sexo = 'M';

        estudante.console();
        estudante02.console();

    }


}
