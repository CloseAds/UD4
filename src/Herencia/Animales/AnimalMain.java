package Herencia.Animales;

public class AnimalMain {

    public static void main(String[] args) {

        Animal a = new Animal("Neo");
        Gato g = new Gato("Kitty","Siamés");
        Perro p = new Perro("Sultán","Pastor alemán");
        Gallina gallina = new Gallina("PIO");

        a.emitirSonido();
        g.emitirSonido();
        p.emitirSonido();
        gallina.emitirSonido();

        PerroPolicia perroPolicia = new PerroPolicia("Dinki", "Pastor Alemán");

        GatoDomestico gatoDomestico = new GatoDomestico("Alex", "Siamés", "Pelaez");

        gatoDomestico.emitirSonido();

        System.out.println(a);
        System.out.println(g);
        System.out.println(p);
        System.out.println(gallina);

    }

}
