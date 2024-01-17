package Herencia.Persona;

public class Docente extends Persona {

    public Docente(String nombre, String apellidos) {
        super(nombre, apellidos);
    }


    public void entrar() {
        System.out.println(getNombre() + " debe fichar antes de entrar en el edificio.");
    }

    public void salir (){
        System.out.println(getNombre() + " debe fichar para salir del edificio");
    }

}
