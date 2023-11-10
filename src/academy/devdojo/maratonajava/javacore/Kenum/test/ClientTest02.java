package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoClient;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClientTest02 {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Zaqueu", TipoClient.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Malaquias", TipoClient.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Malaquias", TipoClient.PESSOA_JURIDICA);

        cliente1.console();
        System.out.println("-------------");

        cliente2.console();
        System.out.println("-------------");
        cliente3.console();

    }

}
