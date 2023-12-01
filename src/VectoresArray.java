import java.util.ArrayList;
import java.util.List;

public class VectoresArray {

    public static void main(String[] args) {


        String[] vector = new String[10];

        extracted(vector);


        List<String> lista = new ArrayList<>();

        lista.add("Hola");
        lista.add("Adios");
        lista.set(1, "Hasta luego");
        lista.add("Adios");

        List<String> lista2 = new ArrayList<>();

        lista2.add("Antonio");
        lista2.add("Maria");

        lista.addAll(lista2);
        lista.add(3, "Fran");

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(" indice " + i + ":" + lista.get(i));

        }

        lista2.clear();

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(" indice " + i + ":" + lista.get(i));

        }

        lista.remove("Antonio");
        lista.remove(2);

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(" indice " + i + ":" + lista.get(i));

        }

    }

    private static void extracted(String[] vector){
        for (int i = 0; i < vector.length; i++) {

            String a = vector[i];

            System.out.println(" indice " + i + ":" +a);

            //a.length;

        }

    }

}
