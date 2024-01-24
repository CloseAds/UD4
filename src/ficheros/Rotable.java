package ficheros;

public interface Rotable {

    public void rotarSentidoAgujas();

    public void rotarSentidoContrarioAgujas();

    default void  rotar360grados(){
        System.out.println("Se queda igual");
    }

    static double radianesGrados(double radianes){
        return radianes * 180 / Math.PI;
    }

    default String describir(){
        return "Imagen es rotable";
    }

}
