package Repaso;
import java.util.ArrayList;
import java.util.List;

public class biblioteca {

    private  String nombre;

    private List<libro> libros;

    public biblioteca() {
    }

    public biblioteca(String nombre, List<libro> libros) {
        this.nombre = nombre;
        this.libros = new ArrayList<libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<libro> getLibros() {
        return libros;
    }

    public void setLibros(List<libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }

    public biblioteca(List<libro> libros) {
        this.libros = libros;
    }
    public  void anadirLibro(String isbn){
        libros.add(libro);
    }

    public void eliminarLibro(String isbn)

}
