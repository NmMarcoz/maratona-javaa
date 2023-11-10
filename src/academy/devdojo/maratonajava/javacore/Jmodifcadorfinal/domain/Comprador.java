package academy.devdojo.maratonajava.javacore.Jmodifcadorfinal.domain;

public class Comprador {
    private String name;

    public Comprador(){

    }
    public Comprador(String name){
        this.name = name;
    }


    public void console(){
        System.out.println("Nome do comprador: " +this.name);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}




