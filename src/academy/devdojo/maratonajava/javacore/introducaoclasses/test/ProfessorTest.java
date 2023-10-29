package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        professor01.nome = "Jonas";
        professor01.materia = "Portugues";
        professor01.idade = 25;
        professor01.sexo = 'M';

        professor01.console();
    }
}
