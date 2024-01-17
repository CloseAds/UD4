package Herencia.Figuras.Excepciones;

public class NombreFiguraNoValidaException extends IllegalArgumentException{

    public NombreFiguraNoValidaException() {
    }

    public NombreFiguraNoValidaException(String s) {
        super(s);
    }
}
