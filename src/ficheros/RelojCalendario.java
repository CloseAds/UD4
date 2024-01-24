package ficheros;

public class RelojCalendario extends Reloj{

    private int dia;

    private int mes;

    private int anyo;

    public RelojCalendario(int hora, int segundos, int minutos, int dia, int mes, int anyo) {
        super(hora, segundos, minutos);
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String obtenerFecha(){
        return + dia + "/" + mes + "/" + anyo;
    }

}
