package Herencia.Persona;

public class Estudiante extends Persona {

    int nie;

    protected String grupo;

    public Estudiante(String nombre, String apellidos, int nie, String grupo) {

        super(nombre, apellidos);

        this.nie = nie;
        this.grupo = grupo;
    }

    public void estudiar(){
        System.out.println(getNombre() + " estudia en " + grupo);
    }

    public void entrar (){
        System.out.println(getNombre() + getApellidos() + " debe de indentificarse para entrar al edificio.");    }

    public void salir (){
        System.out.println(getNombre() + getApellidos() + " debe de indentificarse para salir del edificio.");
    }

}
