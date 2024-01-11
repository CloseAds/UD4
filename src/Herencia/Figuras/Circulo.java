package Herencia.Figuras;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double obtenerArea (){
        return Math.PI * Math.pow(2, radio);
    }

    @Override
    public double obtenerPerimetro (){
        return Math.PI * (radio * 2);
    }

}
