package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente {
    private String nome;
    private String tipo;
    private TipoClient tipoClient;

    public Cliente(String nome, TipoClient tipoClient) {

        this.nome = nome;
        this.tipoClient = tipoClient;
    }
    public void console(){
        System.out.println("Nome do cliente: " +this.nome);
        System.out.println("Tipo do cliente: " +this.tipoClient);
    }

}
