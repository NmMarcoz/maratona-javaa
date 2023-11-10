package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoClient;

public class ClientTest01 {

    public static void main(String[] args){
    Cliente cliente1 = new Cliente("Ezequias", TipoClient.PESSOA_JURIDICA);
    Cliente cliente2 = new Cliente("Gacês", TipoClient.PESSOA_JURIDICA);
    Cliente cliente3 = new Cliente("Jonas",  TipoClient.PESSOA_FISICA);
    cliente1.console();
    cliente2.console();
    cliente3.console();
    }
}
