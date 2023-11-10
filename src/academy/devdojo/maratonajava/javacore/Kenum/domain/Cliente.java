package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente {
    private String nome;
    private String tipo;
    private TipoClient tipoClient;


    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoClient tipoClient) {

        this.nome = nome;
        this.tipoClient = tipoClient;
    }
    public Cliente(String nome, TipoClient tipoClient, TipoPagamento tipoPagamento){
        this(nome, tipoClient);
        this.tipoPagamento = tipoPagamento;
    }
    public void console(){
        System.out.println("Nome do cliente: " +this.nome);
        System.out.println("Tipo do cliente: " +this.tipoClient);
        if(tipoPagamento != null){
            System.out.println("Tipo de pagamento: "+this.tipoPagamento);
            System.out.println("Desconto do cliente: "+ tipoPagamento.calcularDesconto(100));
        }else{
            System.out.println("Tipo de pagamento não informado!");
        }
        System.out.println("Tipo do cliente: "+ tipoClient.getValor());
        System.out.println("Valor do pagamento: R$" + 100);



    }

}
