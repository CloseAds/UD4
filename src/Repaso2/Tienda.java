package Repaso2;

import java.util.List;

public class Tienda {

    private String nombreTienda;

    private List<Producto> catalogo;

    private List<Cliente> clientes;

    public Tienda(String nombreTienda, List<Producto> catalogo, List<Cliente> clientes) {
        this.nombreTienda = nombreTienda;
        this.catalogo = catalogo;
        this.clientes = clientes;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public void anadirCliente(Cliente cliente){
        clientes.add(Cliente);
    }

}
