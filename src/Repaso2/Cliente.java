package Repaso2;

import java.util.Objects;

public class Cliente {

    private String dni;

    private String nombre;

    private Cesta Cesta;

    public Cliente(String dni, String nombre, Cesta cesta) {
        this.dni = dni;
        this.nombre = nombre;
        this.Cesta = new Cesta(Cesta);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Repaso2.Cesta getCesta() {
        return Cesta;
    }

    public void setCesta(Repaso2.Cesta cesta) {
        Cesta = cesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
