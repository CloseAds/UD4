package Herencia.Persona;

public class EstudianteFP extends Estudiante {

    public EstudianteFP(String nombre, String apellidos, int nie, String grupo) {
        super(nombre, apellidos, nie, grupo);
    }

    public void estudiar(){
        System.out.println(getNombre() + " estudia en " + getClass());
    }

}
