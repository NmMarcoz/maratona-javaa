package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        //int, double, float, char, byte, short, long, boolean
        //tipos primitivos como os de cima são escritos em letras minúsculas!
        //para criar uma variável, primeiro o tipo depois o nome!
        int idadeDoPai = 10;
        long numeroGrande = 100000990;
        double salarioDouble = 2000.0;
        float salarioFloat = 2.50F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'k';

        int longcasting = (int)   1000000l;
        long doubbleaslong = (long) 123000.5;

        String namekusei = "Meu nome é tal";
        System.out.println(namekusei);


    }
}
