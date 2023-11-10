package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoClient {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private int  valor;
    TipoClient(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }

}
