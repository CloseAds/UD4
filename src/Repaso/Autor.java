package Repaso;

public class Autor {

    private String nombre;

    public Autor() {
    }

    public String getNombre() {
        return nombre;
    }

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
