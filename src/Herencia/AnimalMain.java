package Herencia;

public class AnimalMain {

    public static void main(String[] args) {

        Animal a = new Animal("Neo");
        Gato g = new Gato("Kitty","Siamés");
        Perro p = new Perro("Sultán","Pastor alemán");

        a.emitirSonido();
        g.emitirSonido();
        p.emitirSonido();

    }

}
