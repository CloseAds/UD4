package Herencia.Persona;

public class HerenciaMain {

    public static void main(String[] args) {

        Persona p = new Persona("Chema", "de Castro");

        p.entrar();
        p.salir();

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

        PersonalAdministracionServicios pas = new PersonalAdministracionServicios("Joaquina","Mayoral", "contable");
        pas.Personal();

        EstudianteESOBach eeso = new EstudianteESOBach("Barto", "Murillo", 12345, "1º BACH");
        eeso.estudiar();

        Persona per2 = new DocenteFP("Carlos", "García");

        per2.entrar();
        per2.salir();

        System.out.println(per2 instanceof  Persona);  // true o false para comprobar si una clase pertenece a otra;
        System.out.println(per2 instanceof Estudiante);
        System.out.println(per2 instanceof Docente);
        System.out.println(per2 instanceof DocenteFP);
        System.out.println(per2 instanceof DocenteESOBach);

        EstudianteFP efp = new EstudianteFP("Vanesa", "Medina", 76895, "1ª ASIR");



    }

}
