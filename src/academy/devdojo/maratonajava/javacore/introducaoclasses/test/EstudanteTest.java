package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 15;
        estudante.nome = "Malaquias";
        estudante.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.idade = 999;
        estudante2.sexo =  'M';


        System.out.println("Nome do estudante é: " +estudante.nome);
        System.out.println("Idade do estudante é: " +estudante.idade);
        System.out.println("Sexo do estudante é: " +estudante.sexo);

        System.out.println("---------------------");

        System.out.println(estudante2.nome); // Como lá na classe estudante eu defini que nome possui um valor de inicialização e neste objeto eu não defini nada para o nome, esse atributo assumiu o valord e inciialização.
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
