package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Maquiavel", "Biologia");
        Professor professor2 = new Professor("Linus", "Computação");
        Seminario seminario1 = new Seminario("Avanços da biologia para testes genéticos", professor1);
        Seminario seminario2 = new Seminario("Biologia para burros", professor1);
        Seminario seminario3 = new Seminario("Computação para idosos", professor2);

        Aluno aluno1 = new Aluno("Jonas", 18);
        Aluno aluno2 = new Aluno("Maria", 22);
        Aluno aluno3 = new Aluno("Ada Lovelace", 15);

        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);
        aluno3.setSeminario(seminario1);

        seminario1.setAlunos(new Aluno[]{aluno1, aluno3});
        seminario2.setAlunos(new Aluno[]{aluno2});
        seminario1.setLocalizacao("Rua almeida - N37");
        seminario2.setLocalizacao("Av Jeronimo de Albuquerque- 21");
        seminario3.setLocalizacao("Rua do passeio, N34");


        professor1.setSeminario(new Seminario[]{seminario1, seminario2});
        professor2.setSeminario(new Seminario[]{seminario3});

        //seminario1.console();
       // System.out.println("-----------------");
        //seminario3.console();

        //System.out.println("----------------------");
        //System.out.println("PROFESSORES AGORA");

        professor1.console();
        System.out.println("Outro professoa agorar");
        professor2.console();


    }

}
