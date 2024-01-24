package ficheros;

public class RelojBinario extends Reloj {

    private String horaBinaria;

    public RelojBinario(int hora, int segundos, int minutos, String horaBinaria) {
        super(hora, segundos, minutos);
        this.horaBinaria = horaBinaria;
    }

    public String getHoraBinaria() {
        return horaBinaria;
    }

    public void setHoraBinaria(String horaBinaria) {
        this.horaBinaria = horaBinaria;
    }

    public int obtenerhora(String hora){
        return + getHora() + getSegundos() / 2;
    }

}
