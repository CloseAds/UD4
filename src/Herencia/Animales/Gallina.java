package Herencia.Animales;

public class Gallina extends Animal{

    public Gallina(String nombre) {
        super(nombre);
    }

    public void emitirSonido(){
        System.out.println(getNombre() + " ha cacareado.");
    }

}
