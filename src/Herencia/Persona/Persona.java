package Herencia.Persona;

public abstract class Persona {

    private String nombre;

    private String apellidos;

    //public entrar();

    //public abstract salir();

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}
