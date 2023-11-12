package academy.devdojo.maratonajava.javacore.Lclassesabstratar.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratar.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratar.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratar.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args){
        //Funcionario funcionario1 = new Funcionario("Zoro", 2000);
        Gerente gerente1 = new Gerente("Nami", 1520);
        Desenvolvedor dev1 = new Desenvolvedor("Alcaia caia", 1520);
       // funcionario1.console();
        //gerente1.console();
        //dev1.console();

        //System.out.println("---------------");
        //gerente1.printaAqui();
        //dev1.printaAqui();

        gerente1.console();


    }
}
