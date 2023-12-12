package Repaso;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private  String nombre;

    private List<Libro> libros;

    public Biblioteca() {
    }

    public Biblioteca(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }

    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }
    public  void anadirLibro(String isbn){
        Libro Libro;
        libros.add(Libro);
    }

    public void eliminarLibro(String isbn) {

    }

}
