package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Piloto {
    private String name;
    private TimeFormula1 timeFormula1;

    public Piloto(String name){
        this.name = name;
    }
    public Piloto(String name, TimeFormula1 timeFormula1){
        this.name = name;
        this.timeFormula1 = timeFormula1;
    }

    public void console(){
        System.out.println("Nome do piloto: " + this.name);
        if(timeFormula1 != null){
            System.out.println("Faz parte do time: "+this.timeFormula1.getName());
        }
    }



    public void setTimeFormula1(TimeFormula1 timeFormula1) {
        this.timeFormula1 = timeFormula1;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
