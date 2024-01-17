package Herencia.Figuras.Excepciones;

public class LadoNoValidoCuadradoException extends IllegalArgumentException{

    public LadoNoValidoCuadradoException() {
        this("El lado del cuadrado no puede ser negativo ni 0.");
    }

    public LadoNoValidoCuadradoException(String s) {
        super(s);
    }
}
