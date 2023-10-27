package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    // PADROES DE INICIALIZAÇÃO
    // byte, short, int, long. float e double = 0
    //char '/u000' -> ' '
    //boolean = false
    //String = null

    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 3;
        idades[2] = 31;

       // System.out.println(idades[0]); //Pega só o valor do indice 0

        String[] nomes = new String[4];
        nomes[0] = "Jonas";
        nomes[1] = "Maria";
        nomes[2] = "Samuel";
        nomes[3] = "Luffy"; //Kaizoku orewanaru!

        for(int i = 0; i < nomes.length; i++){ //Varrendo e printando uma array!
            System.out.println(nomes[i]);
        }
    }
}
