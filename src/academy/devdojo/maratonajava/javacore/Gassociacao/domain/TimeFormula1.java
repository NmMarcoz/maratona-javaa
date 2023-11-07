package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class TimeFormula1 {
    private String name;
    private Piloto[] pilotos;


    public TimeFormula1(String name){
        this.name = name;
    }
    public TimeFormula1(String name, Piloto[] pilotos){
        this.name = name;
        this.pilotos = pilotos;
    }

    public void console(){
        System.out.println("Nome do time: "+ this.name);
        if(pilotos != null){
            System.out.println("Quantidade de pilotos nesse time: "+ pilotos.length);
            for(Piloto piloto: pilotos){
                System.out.println("Nome do piloto: " + piloto.getName());
            }

        }
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPilotos(Piloto[] pilotos){
        this.pilotos = pilotos;
    }

}
