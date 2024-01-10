package Herencia.Persona;

public class EstudianteESOBach extends Estudiante {

    public EstudianteESOBach(String nombre, String apellidos, int nie, String grupo) {
        super(nombre, apellidos, nie, grupo);
    }

    public void estudiar(){
        System.out.println(getNombre() + " estudia en " + grupo);
    }

}
