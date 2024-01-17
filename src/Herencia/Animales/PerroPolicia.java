package Herencia.Animales;

import java.util.Objects;

public class PerroPolicia extends Perro{

    private String unidad;

    public PerroPolicia(String nombre, String raza) {
        super(nombre, raza);
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "PerroPolicia{" +
                "unidad='" + unidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PerroPolicia that = (PerroPolicia) o;
        return Objects.equals(unidad, that.unidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), unidad);
    }
}
