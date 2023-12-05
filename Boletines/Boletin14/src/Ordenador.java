
import partes.*;
public class Ordenador {

    private Monitor mo;
    private Teclado te;
    private Procesador pro;
    private float precio;

    public Ordenador() {
    }

    public Ordenador(Monitor mo, Teclado te, Procesador pro, float precio) {
        this.mo = mo;
        this.te = te;
        this.pro = pro;
        this.precio = precio;
    }

    public Monitor getMo() {
        return mo;
    }

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    public Teclado getTe() {
        return te;
    }

    public void setTe(Teclado te) {
        this.te = te;
    }

    public Procesador getPro() {
        return pro;
    }

    public void setPro(Procesador pro) {
        this.pro = pro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "mo=" + mo +
                ", te=" + te +
                ", pro=" + pro +
                ", precio=" + precio +
                '}';
    }
}




