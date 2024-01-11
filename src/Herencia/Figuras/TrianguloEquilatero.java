package Herencia.Figuras;

public class TrianguloEquilatero extends FiguraGeometrica {

    private float base;

    private float altura;

    public TrianguloEquilatero(String nombre, float base, float altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea (){
        return base * altura / 2;
    }

    @Override
    public double obtenerPerimetro (){
        return base * 3;
    }

}
