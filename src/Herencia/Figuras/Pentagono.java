package Herencia.Figuras;

public class Pentagono extends FiguraGeometrica{
    private double arista;

    public Pentagono(String nombre, double arista) throws IllegalArgumentException{
        super(nombre);
        setArista(arista);
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) throws IllegalArgumentException{
        if (arista < 0){
            throw new IllegalArgumentException("Lado no válido.");
        }
        this.arista = arista;
    }

    public double obtenerPerimetro (){
        return 5 * arista;
    }

    public static void main(String[] args) {
        Pentagono p;
        try{
            p = new Pentagono("Pentágono",-1);
        }
        catch (IllegalArgumentException e){
            p = new Pentagono("Pentágono",0);

        }


        System.out.println(p.obtenerPerimetro());

    }

}
