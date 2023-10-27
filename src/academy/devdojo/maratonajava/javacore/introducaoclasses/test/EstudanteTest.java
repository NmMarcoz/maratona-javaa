package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 15;
        estudante.nome = "Malaquias";
        estudante.sexo = 'M';

        System.out.println("Nome do estudante é: " +estudante.nome);
        System.out.println("Idade do estudante é: " +estudante.idade);
        System.out.println("Sexo do estudante é: " +estudante.sexo);
    }
}
