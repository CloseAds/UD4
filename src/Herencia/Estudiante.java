package Herencia;

public class Estudiante extends Persona{

    int nie;

    private String grupo;

    public Estudiante(String nombre, String apellidos, int nie, String grupo) {

        super(nombre, apellidos);

        this.nie = nie;
        this.grupo = grupo;
    }

    public void estudiar(){
        System.out.println(getNombre() + " estudia en " + grupo);
    }

}
