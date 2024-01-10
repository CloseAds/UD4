package Herencia.Persona;

public class DocenteESOBach extends Docente {

    public DocenteESOBach(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    public void entrar(){
        System.out.println(getNombre() + " " + getApellidos() + " esta entrando al edificio.");
    }

    public void salir(){
        System.out.println(getNombre() + " " + getApellidos() + " esta saliendo del edificio.");
    }

}
