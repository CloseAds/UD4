package ficheros;

import java.util.ArrayList;
import java.util.List;

public class FicheroMain {

    public static void main(String[] args) {

        Imagen i1 = new Imagen(50,100);
        Almacenable dt1 = new DocumentoTexto("Películas");

        i1.recuperar("foto.png");
        i1.guardar("foto.png");

        dt1.recuperar("poema.txt");
        dt1.guardar("poema.txt");

        i1.rotarSentidoAgujas();
        i1.rotarSentidoContrarioAgujas();

        List <Rotable> lista = new ArrayList<>();

        lista.add(i1);
        //lista.add(dt1);

        listar(lista);

        System.out.println(i1.describir());

    }

    private static void listar(List <Rotable> lista){

        for (Rotable l: lista){
            l.rotarSentidoAgujas();
            l.rotar360grados();
            System.out.println(Rotable.radianesGrados(1));
        }

    }

    /*public static void listar(List<Almacenable> lista){
        for (int i = 0; i < lista.size(); i++) {

            Object l = Lista.get();

            if (lista.get(i) instanceof Rotable){

                l.rotarSentidoAgujas();
            }

            //l.guardar("estamos guardando.........");

        }

     */

    }


