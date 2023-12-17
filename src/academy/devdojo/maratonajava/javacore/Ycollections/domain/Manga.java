package academy.devdojo.maratonajava.javacore.Ycollections.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    @Override
    public int compareTo(Manga outroManga) {
        //Negativo se o this for < outroManga
        //se this == outroManga, return 0
        //Positivo se o this for > outroManga
        if(this.id < outroManga.getId()) return -1;
        if(this.id.equals(outroManga.getId())) return 0;
        else return 1;
    }

    public Manga(Long id, String nome, double preco){
        Objects.requireNonNull(nome, "Nome requerido!");
        Objects.requireNonNull(id, "Id requerido!");
        Objects.requireNonNull(preco, "Preço requerido!");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public void console(){
        System.out.println("nome do mangá: " + this.nome);
        System.out.println("ID do mangá: " + this.id);
        System.out.println("preço do mangá: " + this.preco);
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj) return true;
       if(obj == null || getClass() != obj.getClass()) return false;
       Manga manga = (Manga) obj;
       return Double.compare(manga.preco, preco) == 0 && id.equals(manga.id) && nome.equals(manga.nome); //AAAA
    }

    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
}
