package partes;

public class Teclado {
    String marca;

    public Teclado() {
    }

    public Teclado(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "marca='" + marca + '\'' +
                '}';
    }
}

