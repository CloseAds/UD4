package Herencia.Ordenadores;

public class Ordenador {

    protected String numeroSerie;

    protected String marca;

    protected String modelo;

    public Ordenador(String numeroSerie, String marca) {
        this.numeroSerie = "ninguno";
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimir(){
        System.out.println("Ordenador " + marca + modelo + " con nª de serie: " + numeroSerie);
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
