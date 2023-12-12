package Repaso2;

public class TiendaMain {

    static Tienda tienda;

    public static void main(String[] args) {

        inicializarTienda();

    }

    private static void inicializarTienda(){

        tienda = new Tienda("Amazon");

        anadirProductosTienda();

    }

    private static void anadirProductosTienda()throws Exception{

        for (int i = 0; i < 5; i++) {

            Producto p = new Producto();
            p.

        }

    }

}
