import java.util.Scanner;

public class Chamada {

    private int minuto = 0;
    private int hora;
    private int domingo;

    public Chamada() {
    }

    public Chamada(int minuto, int hora, int domingo) {
        this.minuto = minuto;
        this.hora = hora;
        this.domingo = domingo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDomingo() {
        return domingo;
    }

    public void setDomingo(int domingo) {
        this.domingo = domingo;
    }
}



