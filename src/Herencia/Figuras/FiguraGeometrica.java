package Herencia.Figuras;

public class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double obtenerArea (){
        return 0;
    }

    public double obtenerPerimetro (){
        return 0;
    }
}
