package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args){
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 11.4F;
        double doubleP = 245.5D;

        char charP = 'w';
        boolean booleanP = false;

        //Aqui os tipos primitivos viraram objetos, classes Wrappers! Suas regras agora seguirão a mesma dos objetos.

        Byte byteW= 1;
        Short shortW= 1;
        Integer intW= 1; // Isso aqui é autoboxing.
        Long longW= 1L;
        Float floatW= 11.4F;
        Double doubleW= 245.5D;

        Character charW= 'w';
        Boolean booleanW= false;

        int  i = intW; //O nome disso aqui é Unboxing
        Integer intW2 = Integer.parseInt("1"); // Transformando string em inteiro por método do wrapper.
        Integer intW3 = Integer.parseInt("2");

    }
}
