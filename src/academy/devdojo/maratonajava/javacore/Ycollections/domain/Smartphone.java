package academy.devdojo.maratonajava.javacore.Ycollections.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca){
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
