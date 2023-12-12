package Repaso2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cesta {

    private Date fecha;

    private boolean pagado;

    private List<Producto> productos;

    private float importe;

    private Cesta(boolean pagado, List productos) {
        this.pagado = pagado;
        this.productos = new ArrayList<>();
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Cesta{" +
                "fecha=" + fecha +
                ", pagado=" + pagado +
                ", productos='" + productos + '\'' +
                '}';
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void anadirProducto(Producto producto){
        productos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        if (productos.contains(producto)){
            productos.remove(productos.indexOf(producto));
        }
    }

    private void calcularImporte(){
        float _importe = 0;
        for (Producto p : productos){
            _importe = (float) (_importe + p.getPrecio());
        }
        this.importe = _importe;
    }

}
