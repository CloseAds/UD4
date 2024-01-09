package Herencia;

public class HerenciaMain {

    public static void main(String[] args) {

        Persona p = new Persona("Chema", "de_Castro");

        Estudiante e1 = new Estudiante("José", "Moral", 12345, "1º DAM");

        e1.entrar();
        e1.salir();
        e1.estudiar();

        DocenteFP dfp = new DocenteFP("José","Molina");

        Docente d = dfp;
        Persona p1 = dfp;

        //Estudiante e1 = dfp; Estudiante no esta dentro de la jerarquía de personas (da error);

        Persona p2 = new DocenteFP("José","López");

        //Docente d1 = p2; Nunca se puede ir hacia arriba en la jerarquía siendo el orden: Persona, Docente y DocenteFP;

        Docente d2 = dfp;

        Docente d1 = (Docente) p2;  //Si se puede saltar haciendo un casting;

        Persona p3 = new DocenteFP("Antonio", "Pradells");

        p3.salir();

        System.out.println(e1 instanceof Persona);
        System.out.println(e1 instanceof Estudiante);
        System.out.println(p3 instanceof DocenteFP);
        System.out.println(p3 instanceof Estudiante);

        if (p3 instanceof Estudiante) {
            Estudiante e3 = (Estudiante) p3;
            e3.estudiar();
        }

    }

}
