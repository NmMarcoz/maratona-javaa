package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private int salario;

    public Funcionario(String name, String cpf, int salario){
        setCpf(cpf);
        setName(name);
        this.salario = salario;
    }

    public void relatorioPagament(){
        System.out.println("Eu "+ this.name +"recebi o salario de: "+ this.salario);
    }

    public void console(){
        super.console();
        System.out.println("Salario: "+ this.salario);
    }
}
