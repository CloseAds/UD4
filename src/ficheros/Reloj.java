package ficheros;

public class Reloj {

    private int hora = 0;

    private int segundos = 0;

    private int minutos = 0;

    public Reloj(int hora, int segundos, int minutos) {
        this.hora = hora;
        this.segundos = segundos;
        this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void incrementarSegundos(int hora, int segundos, int minutos){
        for (int i = 0; hora < 24; hora++) {
            for (int j = 0; minutos < 60; j++) {
                for (int k = 0; segundos < 60; k++) {

                }
            }
        }
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "hora=" + hora +
                ", segundos=" + segundos +
                ", minutos=" + minutos +
                '}';
    }
}
