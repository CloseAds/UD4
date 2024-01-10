package Herencia.Persona;

public class Persona {

    private String nombre;

    private String apellidos;

    public void entrar(){
        System.out.println(nombre + " " + apellidos +  " entra al edificio.");
    }

    public void salir(){
        System.out.println(nombre + " " + apellidos + " sale del edificio.");
    }

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