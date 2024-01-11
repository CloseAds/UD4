package Herencia.Figuras;

public class Cuadrado extends FiguraGeometrica{

    private float lado;

    public Cuadrado(String nombre, float lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double obtenerArea (){
        return lado * lado;
    }

    @Override
    public double obtenerPerimetro (){
        return lado * 4;
    }

}
